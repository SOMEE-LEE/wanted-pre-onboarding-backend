package com.pretask.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hire {
	public Hire() {
		
	}
	public Hire (int companyId, String hireMoney, String content, String tool) {
		this.companyId = companyId;
		this.hireMoney = hireMoney;
		this.content = content;
		this.tool = tool;
	}
	
	private Integer idx;
	private int companyId;
	private String position;
	private String hireMoney;
	private String content;
	private String tool;
}
