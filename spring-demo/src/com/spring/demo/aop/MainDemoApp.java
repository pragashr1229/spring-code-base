package com.spring.demo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.demo.aop.dao.AccountDAO1;
import com.spring.demo.aop.dao.MembershipDAO1;

public class MainDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		AccountDAO1 theAccountDAO = context.getBean("accountDAO1", AccountDAO1.class);

		// call the business method
		theAccountDAO.addAccount();

		// do it again!
		System.out.println("\nlet's call it again!\n");

		// call the business method again
		theAccountDAO.addAccount();

	
		// get membership bean from spring container
		MembershipDAO1 theMembershipDAO = context.getBean("membershipDAO1", MembershipDAO1.class);

		// call the membership business method
		theMembershipDAO.addSillyMember();

		// close the context
		context.close();
	}

}
