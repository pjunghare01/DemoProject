package Polymorphism;

public class AutomaticPromotion {
	
	public void add() {
		System.out.println("no arg method");
	}
	public void add(int x) {
		System.out.println(x);
	}
	public void add(String s) {
		System.out.println("string arg method");
	}

	public static void main(String[] args) {
		AutomaticPromotion a= new AutomaticPromotion();
		a.add();
		a.add(10);
		a.add("prachi");
		a.add('P');      // ----> This is char datatype int me chala jayega
	//	a.add(10.5f);    //-----> double is bigger datatype this not converted into smaller data type.
		

	}

}

// Automatic Promotion----> Conversion of smaller datya to bigger datatype automaticaliy by the java complier.
// byte short int long float double
//            char
