package com.pretask.web.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pretask.web.model.Hire;
import com.pretask.web.repository.HireRepository;

@Service
// 채용공고 Service
public class HireService {
	@Autowired
	HireRepository hireRepository;
	
	// 채용공고 등록
	public int insert(Hire hire) {
		Map<String, Object> params = new HashMap<>();
	    params.put("companyId", hire.getCompanyId());
	    params.put("position", hire.getPosition());
	    params.put("hireMoney", hire.getHireMoney());
	    params.put("content", hire.getContent());
	    params.put("tool", hire.getTool());
			
	    return hireRepository.insert(hire);
	}
	
	// 채용공고 목록 불러오기
	public List<Hire> list() {
		return hireRepository.list();
	}
	
	// 채용공고 상세정보 불러오기
	public Hire getHireByIdx(Integer idx) {
		return hireRepository.getHireByIdx(idx);
	}

	// 채용공고 수정
	public int editHire(Hire hire) {
		return hireRepository.editHire(hire);
	}

	// 채용공고 삭제
	public int deleteHire(Hire hire) {
		return hireRepository.deleteHire(hire);
	}
}
