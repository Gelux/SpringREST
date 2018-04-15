package com.geluxe.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {
	
	//What are the beans?
	//What are the dependencies of a bean?
	//Where to search for beans?=> no need cause everything is in the same packages/subpackages
	
	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		//Spring Application context
		
		ApplicationContext appContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);
		int searchResult = binarySearch.binarySearch(new int[] {1, 3, 5, 6, 2, 4}, 2);
		//com.geluxe.spring.basics.springin5steps.BubbleSortAlgorithm@27e47833
		//1
		System.out.println(searchResult);
	}
}
