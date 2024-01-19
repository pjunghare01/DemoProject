package Multiple_Inheritance;

public class Student extends Teacher ,Teacher1 {    // as a child

	public static void main(String[] args) {
		Student obj = new Student();      // teacher obj
		obj.Subject();
		
		Teacher1 obj1 = new Teacher1();
		obj1.game();
		

	}

}






















