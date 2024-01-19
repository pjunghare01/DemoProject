package ExceptionHandle;

public class Try_Finally {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}
		finally {         // try catch excute ho ya nhi finally hota he hey.
			System.out.println("Finally block excute everytimes...");
		}

	}

}
