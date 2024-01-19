package ExceptionHandle;

public class Try_Catch_Finally {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);       // with Exception(10/0)
		}
		catch(ArithmeticException e) {
			System.out.println("Catch soluction..");
		}
		
		finally {
			System.out.println("finally  code excute everytimes");
		}
		
		
		

	}

}
