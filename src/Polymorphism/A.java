package Polymorphism;   //Constructors Example

public class A {
	

	public  A() {    // no arg
		System.out.println("i am a Constructor");
	}
	public  A(int x ) {   // value
		System.out.println(x);
	}
	public  A(int x,int y ) {   // with arg
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		A obj= new A();
		A obj1 = new A(78);
		A obj2 = new A(56,89);
		
	
		
	}

}
