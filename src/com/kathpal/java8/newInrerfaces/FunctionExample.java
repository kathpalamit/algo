package com.kathpal.java8.newInrerfaces;

import java.util.Arrays;
import java.util.List;

//iphone, samsung
public class FunctionExample {
	
	public static void main(String[] args) {
	
		List<String> y = Arrays.asList("zld 93,12","fp kindle book");
		p(2,y);
	}

	public static List<String> p(int numO, List<String>orderList){
		
		for(String order :  orderList) {
			String[] after = order.split(" ");
			int total = 0;
			for(int i=0;i<after[1].length();i++) {
				int val = after[1].charAt(i) - '1';	
				
				total |= (1 << val);
			}
			
			System.out.println(total);
			
		}
		return null;
		
	}
	

}
