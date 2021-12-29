package com.spring.demo.inject.collections;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class CollectionsBean2 {
	 private Map<Integer, String> nameMap;

	    @Autowired
	    public void setNameMap(Map<Integer, String> nameMap) {
	        this.nameMap = nameMap;
	    }

	    public void printNameMap() {
	        System.out.println(nameMap);
	    }
}
