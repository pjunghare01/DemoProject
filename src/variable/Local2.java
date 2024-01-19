package variable;

public class Local2 {

	public void rest() {     // declare method
		char c =('P');     // local
		System.out.println(c);
		
		int i = 45;        // local
		System.out.println(i);
		
		boolean a = false;   // local
		System.out.println(a);
		
	}		
		
    public static  void main(String[] args) {
		Local2 obj2 = new Local2();
		obj2.rest();
		
		
		String name = ("Prachi");   // local
		System.out.println(name);
		
		int i = 45;           // local
		System.out.println(i);
		
		boolean b = true;     // local
		System.out.println(b);
		
		

	}

}
