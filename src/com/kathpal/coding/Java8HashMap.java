package com.kathpal.coding;

import java.util.HashMap;
import java.util.Map;

public class Java8HashMap {
	
	public static void main(String[] args) {
		
		//Compute, ifAbsent, ifPresent
		
		Map<String, Integer> emplSalaryData = new HashMap<String, Integer>();
		
		emplSalaryData.put("Java",10000);
		emplSalaryData.put("NodeJS",10000);
		emplSalaryData.put("Go",null);
		
		emplSalaryData.computeIfPresent("Java", (k,v)->v=v+1000);
		
		//emplSalaryData.computeIfPresent("Go", (k,v)->v=v+1000);
		
		emplSalaryData.computeIfAbsent("Go", (k)->10000);
		
		emplSalaryData.values().forEach(System.out::println);
	}

}
