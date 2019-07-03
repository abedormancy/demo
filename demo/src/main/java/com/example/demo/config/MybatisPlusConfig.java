package com.example.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;

@EnableTransactionManagement
@Configuration
@MapperScan("com.example.demo.mapper*")
public class MybatisPlusConfig {

	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}

	@Bean
//	@Profile({ "dev", "test" }) // 设置 dev test 环境开启
	public PerformanceInterceptor performanceInterceptor() {
		return new PerformanceInterceptor();
	}
}
