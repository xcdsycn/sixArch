package com.lxh.six.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"com.lxh.service.six.dao"})
public class MybatisConfig {

}
