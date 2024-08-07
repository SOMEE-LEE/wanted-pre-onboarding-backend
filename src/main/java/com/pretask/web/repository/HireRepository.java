package com.pretask.web.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HireRepository {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public HireRepository() {
		System.out.println("HireRepository()");
	}
}
