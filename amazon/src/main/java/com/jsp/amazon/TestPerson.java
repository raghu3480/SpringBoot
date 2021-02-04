package com.jsp.amazon;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=null;
		
		context=new ClassPathXmlApplicationContext("com/jsp/amazon/Springconfig.xml");
		Person p1=(Person)context.getBean("person");
		System.out.println(p1);
		
		if(context!=null)
		{
			context.close();
		}
		

	}

}
