package com.example.demo.model.condition;

import lombok.Data;

@Data
public class PkCondition {

	private String id;
	
	public Integer toInteger() {
		return Integer.valueOf(id);
	}
	
	public Long toLong() {
		return Long.valueOf(id);
	}
}
