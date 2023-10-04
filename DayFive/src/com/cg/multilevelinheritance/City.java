package com.cg.multilevelinheritance;

public class City extends State {
	
	private String cityname;
	private int pincode;
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "City [cityname=" + cityname + ", pincode=" + pincode + ", getStatename()=" + getStatename()
				+ ", getLanguage()=" + getLanguage() + ", toString()=" + super.toString() + ", getCountryname()="
				+ getCountryname() + ", getCapital()=" + getCapital() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	

}
