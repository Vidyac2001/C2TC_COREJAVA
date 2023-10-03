
public class Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base b = new Base();
		b.methodDefault();
		// b.methodPrivate();
		b.methodProtected();
		b.methodPublic();

		b.varDefault = 45;
		b.varProtected = 23;
		b.varPublic = 67;
		// b.varPrivate=99;
		b.methodDefault();

		b.methodProtected();
		b.methodPublic();


	}

}
