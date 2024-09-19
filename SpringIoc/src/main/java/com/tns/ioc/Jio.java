package com.tns.ioc;

public class Jio implements Sim {
	public Jio () {
		System.out.println("const is called");
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Jio for calling");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Airtel for data");
	}

	
}
