
//////////////////Constructor//////////////////....
//Question 1)no argument Constructor  & 2) Constructor with argument / parameterized Constructor
package Polymorphism;

public class Constructor {
	public Constructor() {         //No-argument Constructor.
		System.out.println("I am a Constructor");
	}
	public Constructor(int x) {    //Parameterized Constructor with-argument Constructor.
		System.out.println(x);
	}
	public Constructor(int x , int y) {
		System.out.println(x+y);
	}
	public Constructor(String s) {
		System.out.println(s);
	}


	public static void main(String[] args) {
		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor(10);
		Constructor obj2 = new Constructor(20,10);
		Constructor obj3 = new Constructor("Rahul");
		

	}

}
