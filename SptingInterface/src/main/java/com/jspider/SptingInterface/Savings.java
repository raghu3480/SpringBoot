package com.jspider.SptingInterface;

public class Savings implements Account
{
	
	@Override
	public void deposit() {
		
		System.out.println("Deposit to Saving Account");
		
	}
	
	@Override
	public void withdraw() {
		System.out.println("Withdraw to Saving Account");
	
		
	}

}
