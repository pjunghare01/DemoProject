package Abstraction;

public class IChild implements IParent{
	@Override
	public void m1() {
		System.out.println("i am a interface 1");
	}

	@Override
	public void m2() {
		System.out.println("i am a interface 2");
		
	}
		
		

	public static void main(String[] args) {
		IChild obj = new IChild();
		obj.m1();
		obj.m2();
		

	}


}
