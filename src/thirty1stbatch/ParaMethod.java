package thirty1stbatch;

public class ParaMethod {

	
	public void add(int x, int y) {
		System.out.println(x+y);
		
	}
	
	public void m1(double d) {
		System.out.println(d);
	}
	
	public void f1(float f) {
		System.out.println(f);
	}
	public static void main(String[] args) {
		ParaMethod obj = new ParaMethod();
		obj.add(10,10);
		obj.m1(10.4757555);
		obj.f1(8);
		
	}

}
