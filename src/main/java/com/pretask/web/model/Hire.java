package com.pretask.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
// 채용공고 데이터
public class Hire {
	public Hire() {}
	
	private Integer idx;
	private int companyId;
	private String position;
	private String hireMoney;
	private String content;
	private String tool;
}
