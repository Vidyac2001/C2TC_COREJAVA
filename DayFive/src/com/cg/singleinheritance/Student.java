package com.cg.singleinheritance;

public class Student extends Citizen {
	
	//data members
	private int id;
	private String collegename;
	
	//default constructor
	public Student() {
		super();
	}
	
	//parameterised constructir
	public Student(String name,String dob,String address,String adharNo,long phoneNo, int id, String collegename)
	{
		this.id=id;
		this.collegename=collegename;
	}

	public int getId() {
		return id;
	}

	//getter and setter
	public void setId(int id) {
		this.id = id;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", collegename=" + collegename + ", getName()=" + getName() + ", getDob()="
				+ getDob() + ", getAddress()=" + getAddress() + ", getAdharNo()=" + getAdharNo() + ", getPhoneNo()="
				+ getPhoneNo() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	

	
	
	
	

}
