package com.pretask.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hire {
	private Integer idx;
	private int companyId;
	private String position;
	private int hireMoney;
	private String content;
	private String tool;
}
