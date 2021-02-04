package com.jsp.springreferenceinjection.dependecycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=null;
		 context=new ClassPathXmlApplicationContext("com/jsp/springreferenceinjection/dependecycheck/Springconfig.xml");
		 
		User u1= (User)context.getBean("user");
		System.out.println(u1);
		
		if (context!=null)
		{
			context.close();
		}

	}

}
