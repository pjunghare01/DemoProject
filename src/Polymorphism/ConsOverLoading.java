package Polymorphism;  // Is Constructor overloading is Possible? -->Yes it is possible (Constructor overloading is a technique to define multiple    
                                                      //  constructor within a same class with different set of parameter.)
public class ConsOverLoading {
	public ConsOverLoading() {
		System.out.println("no arg");
	}
	
	public ConsOverLoading(int i , String s) {
		System.out.println("int and string argument");
		
	}
	public ConsOverLoading(char c,float f) {
		System.out.println("char and float argument pass");
		
	}
	public ConsOverLoading(boolean b) {
		System.out.println("Boolean argument pass");
		
	}
 
	 
 
	 
 
	public static void main(String[] args) {
		ConsOverLoading obj = new ConsOverLoading();
		ConsOverLoading obj1 = new ConsOverLoading(10, "Prachi" );
		ConsOverLoading obj2= new ConsOverLoading('P',6f);
		ConsOverLoading obj3 = new ConsOverLoading(true);
		
		
		
		
	}

}

