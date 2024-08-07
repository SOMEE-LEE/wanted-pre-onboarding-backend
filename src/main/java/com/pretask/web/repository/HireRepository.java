package com.pretask.web.repository;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pretask.web.model.Hire;

@Repository
public class HireRepository {
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public HireRepository() {
		System.out.println("HireRepository()");
	}
	
	public int insert(Hire hire) {
		return sqlSession.insert("hire.insert", hire);
	}
	
	public List<Hire> list() {
		return sqlSession.selectList("hire.list");
	}
}
