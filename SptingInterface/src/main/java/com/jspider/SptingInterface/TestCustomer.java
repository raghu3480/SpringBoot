package com.jspider.SptingInterface;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=null;
		context=new ClassPathXmlApplicationContext("com/jspider/SptingInterface/SpringConfig.xml");
		
		Customer customer=(Customer)context.getBean("customer");
		Account account=customer.getAccount();
		System.out.println(account);
		account.deposit();
		account.withdraw();
		
		Customer customer1=(Customer)context.getBean("customer1");
		Account account1=customer1.getAccount();
		System.out.println(account1);
		account1.deposit();
		account1.withdraw();
		
		
		if (context!=null)
		{
			context.close();
		}
	}

	}


