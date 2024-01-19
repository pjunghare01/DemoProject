package MultilevelInheritance;

public class colour extends Dress {       // child 1
	public void col() {
		System.out.println("black + white");
	}

	public static void main(String[] args) {
		
		colour obj = new colour();
		obj.col();
		obj.pattern();
	}

}
