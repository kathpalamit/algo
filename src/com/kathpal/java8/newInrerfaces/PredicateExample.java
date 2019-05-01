package com.kathpal.java8.newInrerfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.kathpal.java8.newInrerfaces.model.Apple;

/*
 * public interface Predicate<T>{
boolean test (T t);
}
 * */
public class PredicateExample {
	public static void main(String[] args) {
		List<Apple> appleList = Arrays.asList(new Apple("Red", 1), new Apple("Green", 2));
		Predicate<Apple> p = (a) -> a.getColor().equalsIgnoreCase("red");
		List<Apple> filteredList = filterApple(appleList, p);
		filteredList.forEach(System.out::println);
		filteredList = filterApple(appleList, (a) -> a.getColor().equalsIgnoreCase("green"));
		filteredList.forEach(System.out::println);
	}

	private static List<Apple> filterApple(List<Apple> appleList, Predicate<Apple> p) {
		List<Apple> filteredList = new ArrayList<Apple>();
		for (Apple apple : appleList) {
			if (p.test(apple)) {
				filteredList.add(apple);
			}
		}
		return filteredList;
	}

}