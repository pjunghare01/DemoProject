package Array;

import java.util.Arrays;

public class ArrayStringDemo {

	public static void main(String[] args) {
		String s[]= {"ajay","kartik","akshay","srk"}; 
		
		
		System.out.println("for lenght:----");
		System.out.println(s.length);      // for length.
		System.out.println();            // for space
		
		
		System.out.println(" How to print one by one value:----");
		System.out.println(s[0]);          // perticular value 
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
	//	System.out.println(s[4]);         //uncheck exception.
		System.out.println();          // for space
		
		System.out.println("To print all value:---"); 
		System.out.println(Arrays.toString(s));  // to print all value.
		System.out.println();               // for space
		
		
		// first way
		System.out.println("For replace ajay to aaliya:-------");
		s[0]="aaliya";
		System.out.println(Arrays.toString(s));                       // for replace-- ajay to aaliya. ( replace the value is possible).
		System.out.println();    // for space
		/*
		s[4]="Deepika";                                                     // giving exception ( adding new value not possible because array length are fixed).
		System.out.println(Arrays.toString(s));
	   */
		  
		
		//Second Way
		//(for using loop) --to print all value sequencelly                                 (initilization ; condition; incre/decrement)  initilization-starting point
		System.out.println("For loop:---");
		   for(int i=0; i<=3; i++) {          // int i=0; i<4; i++
			   System.out.println(s[i]);
		   }
		   
		   System.out.println();               // for space
		   
		   
		   // Reverse for loop
		   System.out.println("For reverse  for loop:----");
		   for(int i=3; i>=0; i--) {
			   System.out.println(s[i]);
		   }
		   System.out.println();
		   
		
		   //Third way
		   // for each loop
		   System.out.println("For each loop:----");
		   for(String k:s) {
			   System.out.println(k);
		   }
	}

}
