package com.spring.demo.inject.collections;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollectionConfig2 {

	@Bean
	public CollectionsBean2 getCollectionsBean() {
		return new CollectionsBean2();
	}

	@Bean
	public Map<Integer, String> nameMap() {
		Map<Integer, String> nameMap = new HashMap<>();
		nameMap.put(1, "John");
		nameMap.put(2, "Adam");
		nameMap.put(3, "Harry");
		nameMap.put(4, "Harry");
		return nameMap;
	}
}
