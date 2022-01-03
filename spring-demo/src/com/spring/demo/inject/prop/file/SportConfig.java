package com.spring.demo.inject.prop.file;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("com.spring.demo.inject.prop.file")
//	<context:component-scan base-package="com.spring.demo.bean.scope" />

@PropertySource("classpath:sport.properties")
public class SportConfig {

}
