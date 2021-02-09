package com.jsp.amazon;

public class Person {
	
	
	private int empno;
	private String name;
	private long contact;
	private Address address;
	
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [empno=" + empno + ", name=" + name + ", contact=" + contact + ", address=" + address + "]";
	}
	
	
	
	
	

}
