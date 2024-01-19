package ExceptionHandle;

public class Try_Catch { // try-catch example

	public static void main(String[] args) {
		try {
		
   System.out.println(10/0);
	}
		catch(ArithmeticException e) {           // or ----catch(Exception e)--- {     // ArithemeticException....
			System.out.println("Exception handling sucessfully....");
		}

}
}
