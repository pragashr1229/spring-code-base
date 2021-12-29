package com.spring.demo.inject.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollectionConfig1 {

    @Bean
    public CollectionsBean1 getCollectionsBean() {
        return new CollectionsBean1(new HashSet<>(Arrays.asList("John","Aries", "Adam", "Harry")));
    }
    
}