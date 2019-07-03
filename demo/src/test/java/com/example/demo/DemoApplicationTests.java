package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testSelect() {
		User user = new User();
		user.setCreateTime(new Date());
		user.setName("嘟嘟噜");
		user.setAge(21);
		userMapper.insert(user);
		System.out.println("---- select All method test ----");
		IPage<User> userList = userMapper.selectPage(new Page<>(1, 2), null);
		System.out.println(userList);
	}

}
