package Abstraction;

public class AbstractMChild extends AbstractMethod {

	@Override
	public void m1() {
		System.out.println("this is m1");
		
		
	}

	@Override
	public void m2() {
		System.out.println("this is m2");
		
	}

	public static void main(String[] args) {
		AbstractMChild obj = new AbstractMChild();
		obj.m1();
		obj.m2();
		obj.add();
		

	}



}
