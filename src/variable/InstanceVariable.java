package variable;

public class InstanceVariable {
	int i = 100;    // Instance Variable

	
	public void m1() 
	{
		System.out.println(i);          // or   System.out.println("HELLO");
	}
	public static void main(String[] args) 
	{
		InstanceVariable obj = new InstanceVariable();
		obj.m1();
		System.out.println(obj.i);  // here we can write (objectname.variablename)
	}

}
