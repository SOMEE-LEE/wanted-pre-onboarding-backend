package com.pretask.web.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pretask.web.model.Hire;
import com.pretask.web.repository.HireRepository;

@Service
public class HireService {
	@Autowired
	HireRepository hireRepository;
	
	public int insert(Hire hire) {
		Map<String, Object> params = new HashMap<>();
	    params.put("companyId", hire.getCompanyId());
	    params.put("position", hire.getPosition());
	    params.put("hireMoney", hire.getHireMoney());
	    params.put("content", hire.getContent());
	    params.put("tool", hire.getTool());
			
	    return hireRepository.insert(hire);
	}
	
	public List<Hire> list() {
		return hireRepository.list();
	}

	public Hire getHireByIdx(Integer idx) {
		// TODO Auto-generated method stub
		return hireRepository.getHireByIdx(idx);
	}

	public int editHire(Hire hire) {
		return hireRepository.editHire(hire);
	}

	public int deleteHire(Hire hire) {
		return hireRepository.deleteHire(hire);
	}
}
