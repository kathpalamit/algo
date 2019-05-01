package com.kathpal.coding;

import java.util.stream.IntStream;

public class PrimeDigitsSum {
	
	public static void main(String[] args) {
		
		System.out.println(IntStream.rangeClosed(2, 100).filter(PrimeDigitsSum::isPrime).boxed().max((s1,s2)->{return getSum(s1).compareTo(getSum(s2));}).get());
	}
	

	private static boolean isPrime(int number) {
		for(int i=2;i<number/2;i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
	
	private static Integer getSum(Integer number) {
		int sum = 0;
		while(number!=0) {
			sum+=number%10;//9+8 =17
			number/=10;//8
		}
		return sum;
	}

}
