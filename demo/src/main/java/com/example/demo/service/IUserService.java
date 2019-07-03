package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.model.User;
import com.example.demo.model.condition.PagingCondition;

public interface IUserService {

	int add(User user);
	
	int delete(int id);
	
	User get(String id);
	
	IPage<User> list(PagingCondition condition);
	
}
