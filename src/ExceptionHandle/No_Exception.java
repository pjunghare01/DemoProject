package ExceptionHandle;

public class No_Exception {

	public static void main(String[] args) {
		try {
			System.out.println("Hello....");
		}
		catch(ArithmeticException e) {
			System.out.println("Catch soluction..");
		}
		finally {
			System.out.println("finally  code excute everytimes");
		}


	}

}
// beause there have no exception thatswhy we ignore catch block(catch solution )
// aagar exception mila to catch me jayega