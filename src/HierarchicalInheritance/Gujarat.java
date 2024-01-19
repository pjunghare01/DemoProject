package HierarchicalInheritance;

public class Gujarat extends Karnataka{
	public void gujarat() {
		System.out.println("Gujarat: "+"Famous for Dhokla");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gujarat obj= new Gujarat();
		obj.state();
		obj.maharashtraaha();
        obj.karnataka();
        obj.gujarat();
	}

}
