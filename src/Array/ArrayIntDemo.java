package Array;

import java.util.Arrays;

public class ArrayIntDemo {

	public static void main(String[] args) {
		
		// type1
		int c[]=new int[2];    // maximum capacity only 2
		c[0]=10;
		c[1]=20;
	//	c[2]=30;
		System.out.println(Arrays.toString(c));
		System.out.println();
		
		// type 2
		int a[]= {10,20,30,40,50};
		
		System.out.println(a.length);
		System.out.println();
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println();
		
		System.out.println(Arrays.toString(a));
		System.out.println();
		
		a[0]=101;
		System.out.println(a[0]);
		System.out.println();
		
		System.out.println(Arrays.toString(a));
		System.out.println();
		
		/*a[5]=101;
		System.out.println(a[5]);
		System.out.println();
		*/
		
		
		for(int i=0; i<=4; i++) {       //type1
			System.out.println(a[i]);
		}
		System.out.println();
		
		for(int i=0; i<a.length; i++) {    // type 2
			System.out.println(a[i]);
		}
		System.out.println();
		
		for(int i = 4; i>=0; i--) {        //Reverse type 1
			System.out.println(a[i]);
			
		}
		System.out.println();
		
		for(int i=a.length-1; i>=0; i--) {   // reverse type 2
			System.out.println(a[i]);
		}
		System.out.println();
		
		for( int b:a) {
			System.out.println(b);
		}
		
		
		
	}
	
}
