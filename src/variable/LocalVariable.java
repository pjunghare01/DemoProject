package variable;

public class LocalVariable {

	public void logic() {
		int i = 10;              // Local variable
		System.out.println(i);
		
	}
	
	public static void main(String[] args) {
		
		LocalVariable obj = new LocalVariable();  // create object.
		obj.logic();    //  object reference  -----call method.
		
		
		
	}

}

