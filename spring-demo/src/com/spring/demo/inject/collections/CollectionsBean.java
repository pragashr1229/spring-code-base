package com.spring.demo.inject.collections;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class CollectionsBean {

	@Autowired
	private List<String> nameList;

	public void printNameList() {
		System.out.println(nameList);
	}

}
