package thirty1stbatch;

public class A {
	
     public void add() {   // method
    	 System.out.println(10+20);
     }
     
     public void mul() {
    	 System.out.println(5*5);
     }
     
	public static void main(String[] args) {
		A obj = new A();  // object creation
		obj.add(); // calling method by using object referance
		obj.mul();
	}

}
