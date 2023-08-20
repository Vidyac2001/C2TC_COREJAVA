
public class CharDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1='a';
		char ch2='A';
		System.out.println("char1:" +ch1);
		System.out.println("char2:" +ch2);
		
		char ch3=68;
		char ch4=99;
	    System.out.println("char3:" +ch3);
	    System.out.println("char4:" +ch4);
	    
	    char ch5='\u0061';                    //char value in unicode
	    System.out.println("char5:" +ch5);
	    System.out.println("char6:" +'\u0041');
	    
	    ch2=(char)(ch2+1);
	    System.out.println(ch2);
	
	}

}
