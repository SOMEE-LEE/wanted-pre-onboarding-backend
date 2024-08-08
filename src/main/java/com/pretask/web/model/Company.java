package com.pretask.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
// 회사 데이터
public class Company {
	public Company() {}
	
	private Integer companyId;
	private String companyName;
	private String country;
	private String region;	
}
