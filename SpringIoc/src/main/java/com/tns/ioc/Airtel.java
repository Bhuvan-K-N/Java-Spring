package com.tns.ioc;

public class Airtel implements Sim{

	@Override
	public void calling() {
		System.out.println("Airtel for calling");
		
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Airtel for data");
	}

}
