
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char char1='a';
		System.out.println(char1);
		
		//implicit type casting or widening (a smaller datatype can be stored in larger another data type)
		
		int x1=90, x2=7;
		float f1=x1; 
		System.out.println(f1);
		
		float f2=33.678f;
		double d1=f2;
		System.out.println(d1); //implicit
		
		//explicit type casting or narrowing 
		
		byte b1=(byte)x1; 
		System.out.println(b1);
		
		
		float f3=(float)d1; //explicit
		System.out.println(f3);

	}

}
