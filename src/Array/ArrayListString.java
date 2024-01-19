package Array;

import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {
		
		ArrayList<String>s=new ArrayList<String>();
		
		s.add("Prachi"); // o
		s.add("Mohit");  //1
		s.add("Diya");   //2
		s.add("Nilay");  //3
		s.add("Mohit");  //4
		s.add("Aru");    //5
		
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.get(2));
		System.out.println(s.get(5));
	//	System.out.println(s.get(6));  //IndexOutOfBoundException.
		System.out.println();
		
		s.remove(2);
		System.out.println(s);
		System.out.println();
		
		s.add("Diya");
		System.out.println(s);
		System.out.println();
		
		s.add(2, "Rohit");
		System.out.println(s);
		System.out.println();
		
		s.set(3, "Archu");
		System.out.println(s);
		System.out.println();
		
		System.out.println(s.contains("Rohit"));
		System.out.println(s.contains("Nilay"));
		System.out.println(s.contains("Archu"));
		System.out.println();
		
		for(int i=0; i<s.size(); i++) {
			System.out.println(s.get(i));
		}
		System.out.println();
		
		for(String k:s) {
			System.out.println(k);
			
		}
		System.out.println();
		
		
		
		s.clear();
		System.out.println(s);
		

	}

}
