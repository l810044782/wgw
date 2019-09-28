package com.wgw.biz.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.wgw.biz.dao")
public class MyBatisConfig {
}
