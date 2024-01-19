package MultilevelInheritance;

public class RanbirKapoor extends RishiKapoor {     // sub-child
	public void yeJawaniHaiDiwani() {
		System.out.println("sub-Child: " + "Balam pichkari jo tune muze mari....");
	}

	public static void main(String[] args) {
		RanbirKapoor obj = new RanbirKapoor();
		obj.meraNamJokar();
		obj.bolRadheBol();
		obj.yeJawaniHaiDiwani();
		

	}

}
