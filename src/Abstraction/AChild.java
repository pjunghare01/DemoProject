package Abstraction;

public class AChild extends AParent {
	@Override
	public void login() {
		System.out.println("i am a Abstraction");
		
	}

	public static void main(String[] args) {
		AChild obj = new AChild();
		obj.login();
		
	}

	

}
