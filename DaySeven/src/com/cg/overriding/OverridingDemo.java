package com.cg.overriding;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// dynamic binding/late binding/runtime poly/loose coupling
				RBI rbi;

				rbi = new RBI();
				System.out.println(rbi.getRateofInterest());

				rbi = new Axis();
				System.out.println(rbi.getRateofInterest());
				
				rbi = new ICICI();
				System.out.println(rbi.getRateofInterest());
				
				rbi = new HDFC();
				System.out.println(rbi.getRateofInterest());

	}

}
