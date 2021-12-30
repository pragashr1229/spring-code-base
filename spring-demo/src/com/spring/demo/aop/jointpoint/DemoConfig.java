package com.spring.demo.aop.jointpoint;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.spring.demo.aop.jointpoint")
public class DemoConfig {

}
