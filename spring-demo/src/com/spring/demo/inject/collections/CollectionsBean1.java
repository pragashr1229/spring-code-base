package com.spring.demo.inject.collections;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class CollectionsBean1 {

	private Set<String> nameSet;

	@Autowired
	public CollectionsBean1(Set<String> strings) {
        this.nameSet = strings;
    }

	public void printNameSet() {
		System.out.println(nameSet);
	}
}
