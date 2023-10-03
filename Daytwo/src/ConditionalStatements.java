
public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=15, y=20;
		
		if(x<y)
			System.out.println(x);
		System.out.println("x is " + x);
		
		if(x>y)
			System.out.println(x);
		else
			System.out.println(y);
			
		char ch='l';
		switch(ch)
		{
		case 'l': System.out.println("a");
		case 'a': System.out.println("L");
					break;
		case 'L': System.out.println(ch);
		default: System.out.println("nothing");
		
		}
		
		//nested if-else
		
		int n1=88,n2=78;
		if(n1<=n2)
		{
			if(n1>18)
				System.out.println("n1 is eligible");
			else
				System.out.println("n1 is not eligible");
		}
		else {
			if(n2>18)
				System.out.println("n2 is eligible");
			else 
				System.out.println("n2 is not eligible");
		}
		
		

	}

}
