package thirty1stbatch;

public class ArrayExample {

	public static void main(String[] args) {
	/*	int[] arr = {10, 20, 30, 40};
		System.out.println(arr);
		int max =0;
		for(int i = 0; i<arr.length; i++ ) {
			for(int j =i+1; j<arr.length)
		}
		*/
//		int[] a = {10 , 20 , 30 , 40};
//		System.out.println(a[1]);    ---> 20
		
//		int[] a = {10 , 20 , 30 , 40};
//		System.out.println(a.length);    ---->4
		
		
		// Displaying the Array (Naive Way)
		System.out.println("printing using naive way");
		int[] a = {10 , 20 , 30 , 40};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		
		//Displaying the array (for loop)
		System.out.println("printing using for loop");
		int[] arr = {10 , 20 , 30 , 40};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		// Displaying the array in reverse order(for loop)
		System.out.println("printing using for loop in Reverse order");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
		//Displaying the array (for  each loop)
				System.out.println("printing using for each loop");
				for(int element : arr) {
					System.out.println(element);
				}
		
		

	}

}
