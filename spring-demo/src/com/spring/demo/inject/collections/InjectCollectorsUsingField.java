package com.spring.demo.inject.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectCollectorsUsingField {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollectionConfig.class);
		CollectionsBean collectionsBean = context.getBean(CollectionsBean.class);
		collectionsBean.printNameList();
	}
}
