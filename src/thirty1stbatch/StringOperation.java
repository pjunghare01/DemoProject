package thirty1stbatch;

public class StringOperation {

	
	public static void main(String[] args) {
		
		String s = "Varun";
		
		System.out.println(s.length());
		
		try {
		System.out.println(s.charAt(6));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("maximyum index value is 4... do not use 5,6");
			System.out.println(s.charAt(4));
		}
		System.out.println(s.concat(" Dhavan"));
		System.out.println(s.equals("Varun"));      // name equal raha to true otherwise false
		System.out.println(s.equalsIgnoreCase(s));
		System.out.println(s.equalsIgnoreCase(null));
		System.out.println(s.substring(2));        // substring means jo index no pass karugi vaha se ye chalu hoga
		System.out.println(s.startsWith(s));
		System.out.println(s.endsWith(s));
		System.out.println(s.replace('a', 'o'));     // replace a to o
		System.out.println(s.trim());
		System.out.println(s.indexOf(2));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		
		
		

	}

}
