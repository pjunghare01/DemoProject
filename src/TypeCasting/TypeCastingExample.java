package TypeCasting;

public class TypeCastingExample {

	public static void main(String[] args) {
	int i=10;
	double d =i;       // up-casting
	System.out.println(d);
	
	double d1=10.6;
	int i1= (int) d1;      // down-casting-  not possible aagar krna ho (int) le sakte but data loss hoga. 
	System.out.println(i1);            // 10.6 aana chahiye but output me 10 he aaya 0.6 data loss hua.
	
	float f = 5f;       // up-casting.
	double d2=f;
	System.out.println(d2);
	}

}

// byte-short-int-long-float-double
//            |
//           char.

















