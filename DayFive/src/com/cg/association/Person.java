package com.cg.association;

public class Person {
	
	private String name; // non-static // object
	private Address address;
	private static String batchno; // class - B70
	
	public Person(String name, Address address, String batchno) {
		//super();
		this.name = name;
		this.address = address;
		this.batchno = batchno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public static String getBatchno() {
		return batchno;
	}

	public static void setBatchno(String batchno) {
		Person.batchno = batchno;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(batchno);
	}
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("batch no: " + batchno);
		System.out.println("Address: " + address.getStreet() + ", " + address.getCity() + ", " + address.getState()
				+ " " + address.getPincode());
	}
	
	

}
