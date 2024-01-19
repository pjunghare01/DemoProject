package thirty1stbatch;

public class NestedIfElseCondition {

	public static void main(String[] args) {
		int marks = 36;
		if(marks>=75) {
			System.out.println("pass with Distintion");
		}
		
		else if(marks>=60&& marks<75) {
			System.out.println("pass with first class");
		}
		
		else if(marks>=50&& marks<60) {
			System.out.println("pass with second class");
		}
		
		else if(marks>=35&& marks<50) {
			System.out.println("pass with pass class");
		}
		
		
		else {
			System.out.println("Failed");
			
		}

	}

}
