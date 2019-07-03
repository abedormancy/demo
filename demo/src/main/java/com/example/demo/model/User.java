package com.example.demo.model;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableLogic;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {

	private Long id;
	
	private String name;
	
	private Integer age;
	
	private Date createTime;
	
	@TableLogic
	private Integer isDelete;
	
}
