package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.model.condition.PagingCondition;

@Service
public class UserService implements IUserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int add(User user) {
		return userMapper.insert(user);
	}

	@Override
	public int delete(int id) {
		return userMapper.deleteById(id);
	}

	@Override
	public User get(String id) {
		return userMapper.selectById(id);
	}

	@Override
	public IPage<User> list(PagingCondition condition) {
		return userMapper.selectPage(new Page<>(condition.getPageNum(), condition.getPageSize()), null);
	}

}
