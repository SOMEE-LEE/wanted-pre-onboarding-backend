package com.pretask.web.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pretask.web.model.Hire;

@Repository
// 채용공고 리파지토리
public class HireRepository {
	@Autowired
	SqlSessionTemplate sqlSession;
	
	// 기본 생성자
	public HireRepository() {}
	
	// 채용공고 등록
	public int insert(Hire hire) {
		return sqlSession.insert("hire.insert", hire);
	}
	
	// 채용공고 목록 불러오기
	public List<Hire> list() {
		return sqlSession.selectList("hire.list");
	}

	// 채용공고 상세정보 불러오기
	public Hire getHireByIdx(Integer idx) {
		return sqlSession.selectOne("hire.detail", idx);
	}

	// 채용공고 수정
	public int editHire(Hire hire) {
		return sqlSession.update("hire.update",hire);
	}

	// 채용공고 삭제
	public int deleteHire(Hire hire) {
		return sqlSession.delete("hire.delete", hire);
	}
}
