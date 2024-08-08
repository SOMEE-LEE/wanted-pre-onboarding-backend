package com.pretask.web.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pretask.web.model.Company;

@Repository
// 회사 리파지토리
public class CompanyRepository {
	@Autowired
	SqlSessionTemplate sqlSession;

	// 기본 생성자
	public CompanyRepository() {
		System.out.println("CompanyRepository()");
	}
	
	// 회사 목록 불러오기
	public List<Company> list() {
		return sqlSession.selectList("company.clist");
	}
	
	// 회사 상세정보 불러오기
	public Company getCompanyByCid(Integer companyId) {
		return sqlSession.selectOne("company.cdetail", companyId);
	}
}
