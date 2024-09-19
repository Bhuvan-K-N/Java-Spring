package com.tns.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c= new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("config Loded");
		Sim a=c.getBean(Airtel.class);
		a.calling();
		a.data();
		
		
	}

}
