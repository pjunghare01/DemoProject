package variable;

public class StaticVariable {
	
	static int i=10; //static variable
	static char c=('P');

	public static void main(String[] args) {
		System.out.println(i);      // by using Directly.
		System.out.println(c);
		
		StaticVariable obj = new StaticVariable ();     // by using object reference
		System.out.println(obj.i);          // ----(object_name.variablename)
		System.out.println(obj.c);
		
		System.out.println(StaticVariable.i);              // by using Class reference 
		System.out.println(StaticVariable.c);   //----(class_name.variablename)
		

	}

}
