package JavaProgramAll;

public class Factorial {      

	public static void main(String[] args) {
		int n = 5;
		int fact =1;
		for(int i=1; i<=n; i++ ) //5!= 1*2*3*4*5  
		{
			fact = fact*i;	
			
		}
		
		System.out.println(" Factorial of " + n+  " is " + fact);

	}

}














































/*
 Dry-Run--- 
1)first i create one class factorial class public class Factorial {      
2)then gave one main method public static void main(String[] args){
3)int n = 5;   then initializes the variable n with the value 5 , its indicate the calculate the factorial of 5. 
4)int fact =1; then initializes the variable fact with the value 1 for factorial calculation.  
5)for(int i=1; i<=n; i++ ) this is a for loop for iterates from i=1 i<=n and i++(increment)
6)fact = fact*i;	 this line updates the fact variable by multiplying with the loop loop variable i in each iteration.
7) System.out.println(" Factorial of " + n+  " is " + fact);  this prints the calculated the factorial to the console.

*/



/*5!= 1*2*3*4*5   //5!= 5*4*3*2*1
by 5 to 1 -------------- //
for(int i=5; i>=1; i--) {   //5!= 5*4*3*2*1

fact = fact*i;
}
 */
