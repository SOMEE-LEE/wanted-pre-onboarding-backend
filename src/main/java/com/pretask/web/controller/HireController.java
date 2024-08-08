package com.pretask.web.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pretask.web.model.Hire;
import com.pretask.web.service.HireService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/pretask")
public class HireController {
	
	@Autowired
	HireService hireService;
	
	// 채용공고 목록 페이지
	@GetMapping("")
	public String home(Model model) {
		List<Hire> list =  hireService.list();
		model.addAttribute("list", list);
		return "hire/hire_list";
	}
	
	// 채용공고 등록 페이지
	@GetMapping("/hire_add")
	public ModelAndView create() {
		return new ModelAndView("hire/create");
	}
	
	// 채용공고 등록 처리
	@PostMapping("/hire_add")
	public ModelAndView create(@RequestParam Map<String, String> map, Hire hire) {
		System.out.println(map);
		System.out.println(hire);
		int rs = hireService.insert(hire);
		System.out.println();
		ModelAndView mav = new ModelAndView();
		if(rs == 1) {
			mav.setViewName("redirect:hire/hire_list");
		}else {
			mav.setViewName("redirect:create");
		}
		return mav; 
	}
	
	// 채용공고 상세 페이지
	@GetMapping("/hire_detail")
	public String detail(Model model, @RequestParam Integer idx) {
		Hire hire =  hireService.getHireByIdx(idx);
		model.addAttribute("hire", hire);
		return "hire/detail";
	}
	
	// 채용공고 수정 페이지
	@GetMapping("/hire_edit")
	public String update(Model model, @RequestParam Integer idx) {
		Hire hire =  hireService.getHireByIdx(idx);
		model.addAttribute("hire", hire);
		return "hire/update";
	}
	
	// 채용공고 수정 처리
	@PostMapping("/hire_edit")
	public String update(Model model, Hire hire) {
		System.out.println(hire);
		int rs = hireService.editHire(hire);
		
		if(rs == 1) {
			return "redirect:hire_detail?idx="+hire.getIdx();
		}else {
			return "redirect:hire_edit?idx="+hire.getIdx();
		}
		
	}
	
}
