package ExceptionHandle;

public class StringOperation1 {

	public static void main(String[] args) {
		String name = "Prachi";
		String name1 = "Rohit";
		
		System.out.println(name.length());   // calculate the length of string.
		System.out.println(name.charAt(3)); // to written character, present at the specific Index value. p-0 r-1 a-2 c-3 h-4 i-5
		
		//USE try-catch.
		try {
	  System.out.println(name.charAt(6)); //------- Exception (StringIndexOutofBoundException)
		} 
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("maximum value is 5... do not use 6");
			System.out.println(name.charAt(5));
		}
		
		
		
		System.out.println(name.concat(" Junghare"));    // add something into the existing things.
		System.out.println(name.equals("prachi"));     // comapre two string according to containt.  if matches output will be true otherwisw false.
		System.out.println(name.equals("Prachi"));     // same Prachi thats why
		System.out.println(name.equals(name1));    // beacause 2 strings are not same means Prachi and Rohit are.. thats why they missmatch the sentence and answer will be false.
		System.out.println(name.equalsIgnoreCase(name1));  // Ignore case value me upper case lower case raha tobhi true hota he bass string change hua to false..
		System.out.println(name.substring(2));       //  Substring   p-0 r-1 a-2 c-3 h-4 i-5
		System.out.println(name.substring(2, 5));    //  it is substring overloading (start to end index provider].
		System.out.println(name.startsWith("r"));    // beacause it start with p not r thats why this is false
		System.out.println(name.endsWith("i"));       // its end with i thats why this is true
		System.out.println(name.replace('r', 'p'));    // replace r to p then ppachi.
		System.out.println(name.trim());
		System.out.println(name.indexOf('a'));       // calculate index value
			
		
	}

}
