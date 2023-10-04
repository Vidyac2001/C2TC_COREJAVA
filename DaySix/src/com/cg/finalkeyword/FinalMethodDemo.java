package com.cg.finalkeyword;

public class FinalMethodDemo extends FinalMethod {
	
	//@Override - cannot be override
	/*public void show()
	 {
		System.out.println("Hello"); 
	 }*/
	
	@Override
	 public String print()
	 {
		 return "Hi";
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalMethod fm=new FinalMethod();
		fm.show();

	}

}
