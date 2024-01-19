package thirty1stbatch;

public class SwitchCaseFallThrough {

	public static void main(String[] args) {
          int number = 30;
		
		switch(number) {
		case 10:
			System.out.println("i am 10");
			
			
		case 20:
			System.out.println("i am 20");
			
			
		case 30:
			System.out.println("i am 30");
			
			
		default:
			System.out.println("none of  the above is matching");
				
		}

	}

}
