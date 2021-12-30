package com.spring.demo.aop.dao;

import org.springframework.stereotype.Component;

import com.spring.demo.aop.jointpoint.Account;

@Component
public class AccountDAO1 {

	public void addAccount() {
		
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
		
	}
}
