package MultilevelInheritance;              // Multilevel Inheritance

public class Dress {         // parent
	public void pattern() {
		System.out.println("Jeans-top + kurti");
	}

	public static void main(String[] args) {
		
		Dress obj = new Dress();
		obj.pattern();

	}

}
