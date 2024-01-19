package variable;

public class MixVariable {
	int x= 4;     // Instance Variable..........
	static char c =('R');  // static variable............

	public void rest() {    // local variable...................
		int i = 10;
		System.out.println(i);
		System.out.println(x);
	}
	public static void main(String[] args) {
		MixVariable obj= new MixVariable();
		obj.rest();
		System.out.println(obj.x);
		System.out.println(c);           // directly
		System.out.println(obj.c);   // by using object reference
		System.out.println(MixVariable.c);        //by using class reference
		
		
		

	}

}
