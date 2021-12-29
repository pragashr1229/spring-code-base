package com.spring.demo.inject.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectCollectorsUsingConstructor {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollectionConfig1.class);
		CollectionsBean1 collectionsBean = context.getBean(CollectionsBean1.class);
		collectionsBean.printNameSet();
	}
}
