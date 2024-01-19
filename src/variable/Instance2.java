package variable;

public class Instance2 {
	int x= 2;
	char c = ('a');
	boolean b=false;
  
	public void me() {
		System.out.println(x);  //2
		System.out.println(c);   //a
		System.out.println(b);   // false
	}
	public static void main(String[] args) {
		Instance2 obj = new Instance2();
		obj.me();                         // obj reference by method
		System.out.println(obj.x);        // 2 ----> obj reference by vaeiable
		System.out.println("PRACHI ASHOK JUNGHARE");   //name
		System.out.println(obj.c);       //a
		System.out.println(obj.b);         // false
		

	}

}
