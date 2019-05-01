package com.kathpal.java8.newInrerfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


/*@FunctionalInterface
public interface Consumer<T>{
void accept(T t);
}*/

public class ConsumerExample {
	public static void main(String[] args) {
		forEach(Arrays.asList(1,2,3,4), (a)->System.out.println(a));
		forEach(Arrays.asList(1,2,3,4), System.out::println);
	}
	
	private static void forEach(List<Integer> intList, Consumer<Integer>consumer) {
		for(Integer a:intList) {
			consumer.accept(a);
		}
	}

}
