package MultilevelInheritance;

public class sizes extends colour{             // child2
	public void size() {
		System.out.println("Oversize");
	}

	public static void main(String[] args) {
		sizes obj = new sizes();
		obj.size();
		obj.col();
		obj.pattern();
		
		

	}

}
