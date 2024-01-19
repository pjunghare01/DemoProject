package thirty1stbatch;

public class MethodExample {
      
	public void add() {       // method   SYNTAX-->[access_modifier  retern-type  method_name() ]
		System.out.println(1+1);
	}
	
	public void login() {      //camalCasing example
		System.out.println("Code to login functionality");
	}
	
	public void verifyLoginButton() {
		System.out.println("Code to verify Login Button");
	}
	
	public static void main(String[] args)
	{
		 MethodExample obj= new MethodExample(); // object  SYNTAX-->[classname objectname = new classname]
		 obj.add();// calling method by using object  referances.....  SYNTAX--> [objectname.methodname();]
		 
		 obj.login();
		 
		 obj.verifyLoginButton();
	}

}
