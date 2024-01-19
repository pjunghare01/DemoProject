package Polymorphism;     // subclass

public class AbhishekBacchan extends AmitabhBacchan{
	public void marry() {  // overriding
		System.out.println("Aishwarya royyy...");
	}

	public static void main(String[] args) {
		AbhishekBacchan a = new AbhishekBacchan();
	  a.property();
	 a.marry();
	
	}

}
