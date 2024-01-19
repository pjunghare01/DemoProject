package Array;

import java.util.ArrayList;


public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> obj = new ArrayList<Integer>();   // declear Arraylist
		
		
		
		obj.add(10);  // index o
		
		obj.add(20);  // index 1
		
		obj.add(30);  // index 2
		
		obj.add(40);  // index 3
		
		obj.add(30);  // index 4
		
		System.out.println(obj); // how to print---- sop(Mention the name)  {order of Intersion}-jiss order me insert kiya he vo oder
		                           // duplicate value are allowed.
		System.out.println("\n");   // double space
		
		// calculate length
		System.out.println(obj.size());  //calculate the length
	    System.out.println();
	    
	    System.out.println(obj.get(2));  // to Retrive any perticular value at a perticular index.
		System.out.println(obj.get(4));
	//	System.out.println(obj.get(5));   // IndexOutOfBoundException.
		System.out.println();
		
		
		// remove
		obj.remove(0);
		System.out.println(obj);
		
		//add  -- end me add hoga 
		obj.add(10);
		System.out.println(obj);
		
		// we can add value sepcific index/position --Inserts the specified element at the specified position in thislist. 
		//Shifts the element currently at that position (if any) and any subsequent elements to the right 
		obj.add(0, 99);
		System.out.println(obj);
		
		
		System.out.println();
		
		// for replace
		obj.set(3, 55);    
		System.out.println(obj);    // replace index 3{ 40 replace 55}
		
		
		System.out.println();
		
		//check value avaiable or not
		 System.out.println(obj.contains(99));
		 System.out.println(obj.contains(40)); // beacause it replace 40 to 55
		 System.out.println(obj.contains(55));
		 
		 System.out.println();

		 
		 // to clear
//		 obj.clear();
//		 System.out.println(obj);
//		 System.out.println();
		 
		 // for loop
		 for(int i=0; i<obj.size(); i++) {
			 System.out.println(obj.get(i));
		 }
		 
		 System.out.println();
		 
		 //for Reverse loop.
		 for(int i=obj.size()-1; i>=0; i--) {      // for(int i=5; i>=0; i--)
			 System.out.println(obj.get(i));
			 
		 }
		 System.out.println();
		 
		 // for each loop
		 for(int obj1:obj) {
			 System.out.println(obj1);
			 
		 }
		
	
		
		
	}
		
	
	

}








































