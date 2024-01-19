package Polymorphism;    // Inside a single class , same method name but different type of aruments 

public class MethodOverLoading {
	public void add() {
		System.out.println("No arg method");
	}
	public void add(int x) {
		System.out.println(x);   //System.out.println("int arg method");
		
	}
	public void add(String s) {
		System.out.println("String arg method");
	}

	public static void main(String[] args) {
		MethodOverLoading m = new MethodOverLoading();
		m.add();
		m.add(23);
		m.add("prachi");
		m.add('P');           // AP(Automatic Promotion ) is possible here. ----- byte short int long float double ( p=80)
	//	m.add(10.7d);         beause it is a higher position 
		//m.add("865l");
		m.add('A');
	}

}
