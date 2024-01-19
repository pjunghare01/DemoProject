package MultilevelInheritance;

public class RishiKapoor extends RajKapoor{       // child
	public void bolRadheBol() {
		System.out.println("Child:  "+ "Bol radhe bol tune ye ky kiya.....");
	}

	public static void main(String[] args) {
		RishiKapoor obj= new RishiKapoor();
		obj.meraNamJokar();
		obj.bolRadheBol();
		
		
		
	}

}
