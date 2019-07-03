package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.model.User;
import com.example.demo.model.condition.PagingCondition;
import com.example.demo.model.condition.PkCondition;
import com.example.demo.service.IUserService;
import com.example.demo.util.WrapperResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "0101_用户管理")
@RestController("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ApiOperation(value = "add user", notes = "添加用户")
	public WrapperResult<Integer> add(@RequestBody User user) {
		int value = userService.add(user);
		return WrapperResult.build(value);
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.POST)
	@ApiOperation(value = "get user", notes = "获取用户")
	public WrapperResult<User> get(@RequestBody PkCondition condition) {
		User user = userService.get(condition.getId());
		return WrapperResult.build(user);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ApiOperation(value = "delete user", notes = "删除用户")
	public WrapperResult<Integer> delete(@RequestBody PkCondition condition) {
		int value = userService.delete(condition.toInteger());
		return WrapperResult.build(value);
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ApiOperation(value = "list user", notes = "用户列表")
	public WrapperResult<IPage<User>> list(@RequestBody PagingCondition condition) {
		IPage<User> users = userService.list(condition);
		return WrapperResult.build(users);
	}
	
}
