
public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {11,22,33,44,55};
		for(int i=0;i<a.length;i++) {    //for loop
			System.out.println(a[i]);
		}
		
		int n=1;
		while(n<=10)  //while loop
		{
			System.out.print(n+" ");
			n++;
		}
		
		int n1=5;   //do while loop
		do {
			System.out.println(n1);
			n1=n1+5;
		} while (n1<=50);
		
		
		int x=10;
		int y=15;
		int z=20;
		
		x++; //11
		int sum1= x++ + y + ++z;  //11+15+21  (later x=12)
		System.out.println(sum1);
		
		int sum2= x++ + ++y + z--; //12+16+21 (later x=13 & z=20)
		System.out.println(sum2);

	}

}
