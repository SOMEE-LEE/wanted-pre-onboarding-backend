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
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String home(Model model) {
		List<Hire> list =  hireService.list();
		model.addAttribute("list", list);
		return "hire/hire_list";
	}
	
	// 채용공고 등록 페이지
	@RequestMapping(value = "/hire_add", method = RequestMethod.GET)
	public ModelAndView create() {
		return new ModelAndView("hire/create");
	}
	
	// 채용공고 등록 
	@RequestMapping(value = "/hire_add", method = RequestMethod.POST)
	public ModelAndView create(@RequestParam Map<String, String> map, Hire hire) {
		System.out.println(map);
		System.out.println(hire);
		int rs = hireService.insert(hire);
		System.out.println();
		ModelAndView mav = new ModelAndView();
		if(rs == 1) {
			mav.setViewName("redirece:hire/hire_list");
		}else {
			mav.setViewName("redirect:create");
		}
		return mav; 
	}
}
