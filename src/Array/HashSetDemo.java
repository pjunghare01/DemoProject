package Array;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer>hs= new HashSet<Integer>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(30);
		
		System.out.println(hs);  // to print
		System.out.println(hs.size());
		//System.out.println(hs.get());  //error -- they have index.

		hs.remove(20);
		System.out.println(hs);
		
		hs.add(20);
		System.out.println(hs);
		
	    System.out.println(hs.contains(20));
	    System.out.println(hs.contains(60));
	    
	   
	    
//	    for(int i=0; i<=hs.size; i++) {
//	    	System.out.println(hs.get()); // without index not possible..
//	    }

	    for(int h:hs) {             //to print
	    	System.out.println(h);
	    }
	    
	    hs.clear();
	    System.out.println(hs);
		
		
	}

}
