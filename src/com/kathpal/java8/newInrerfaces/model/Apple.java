package com.kathpal.java8.newInrerfaces.model;

public class Apple {
	private String color;
	private int id;

	public Apple(String color, int id) {
		super();
		this.id = id;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		
		return this.id +" --> "+this.color;
	}

}
