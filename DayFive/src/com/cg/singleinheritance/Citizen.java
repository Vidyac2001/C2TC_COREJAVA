package com.cg.singleinheritance;

public class Citizen {
	//data members
	private String name;
	private String dob;
	private String address;
	private String adharNo;
	private long phoneNo;
	
	//default constructor
	public Citizen()
	{
		System.out.println("Citizen object is created");
	}
	
	//parameterized constructor
	public Citizen(String name,String dob,String address,String adharNo,long phoneNo) {
		this.name=name;
		this.dob=dob;
		this.address=address;
		this.adharNo=adharNo;
		this.phoneNo=phoneNo;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", dob=" + dob + ", address=" + address + ", adharNo=" + adharNo + ", phoneNo="
				+ phoneNo + "]";
	}

	
	}

	

	
	
	
	


