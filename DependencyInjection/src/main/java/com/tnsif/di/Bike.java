package com.tnsif.di;

public class Bike implements Vehicle{
	
	String name;
	String model;
	
	
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Bike(String name, String model) {
		super();
		this.name = name;
		this.model = model;
		System.out.println(name+" "+model);
	}


	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

}