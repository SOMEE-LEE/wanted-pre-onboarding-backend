package com.pretask.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pretask.web.model.Company;
import com.pretask.web.repository.CompanyRepository;

@Service
//회사 Service
public class CompanyService {
	@Autowired
	CompanyRepository companyRepository;
	
	// 회사 리스트 불러오기
	public List<Company> list() {
		return companyRepository.list();
	}

	// 회사 상세정보 가져오기
	public Company getCompanyByCid(Integer companyId) {
		return companyRepository.getCompanyByCid(companyId);
	}
}
