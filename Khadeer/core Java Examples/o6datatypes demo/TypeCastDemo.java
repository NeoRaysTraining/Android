/* program to implement implicit and explicit casting */
class TypeCastDemo 
{
	public static void main(String[] args) 
	{
	 /*	byte b=5;
		int i=0;
		 i=b; //implicit casting
		System.out.println(i); */

	/* byte b=0;
	int i=5;
	System.out.println(b);
	System.out.println(i);
	b=(byte)i; //explicit casting
	System.out.println("value of b is "+b);
	System.out.println("value of i is "+i); */

	  /* int a=10;
	   float f=0;
	   System.out.println("value of a is "+a);
	   System.out.println("value of f is "+f);
	   a=(int)f; //explicit casting
	   System.out.println("value of a is"+a);
	   System.out.println("value of f is"+f); */

	int a=0;
	float f=5.908f;
	System.out.println("value of a is"+a);
	System.out.println("value of f is"+f);
	a=(int)f;  //explicit casting
	System.out.println("value of a is"+a);
	System.out.println("value of f is"+f);
	
	}
}
