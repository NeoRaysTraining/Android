class StaticBlockWithMain
{

	static int a = 1;
	static int b;

//						   STATIC BLOCK	
	static														// Executes only 1ce when the class gets loaded
	{
		System.out.println("inside static block");
		System.out.println("val of 'a' in static block before is "+a);
		System.out.println("val of 'b' in static block before is "+b);
		b = a * 3;
		System.out.println("val of 'a' in static block after is "+a);
		System.out.println("val of 'b' in static block after is "+b);
		System.out.println("End of static block");
	}
//		   void m1(int x)
	static void m1(int x)										// Executes everytime the method is called
	{
		System.out.println("inside m1()");
		System.out.println("val of 'a' in m1() is "+a);
		System.out.println("val of 'b' in m1() is "+b);
		System.out.println("val of 'x' in m1() is "+x);
		System.out.println("End of m1()");
	}
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		m1(5);													//can be accessed without creating an object
/*		StaticBlockWithMain h = new StaticBlockWithMain();
		h.m1(5);												//CANNOT be accessed without creating an object
*/		System.out.println("End of main");
	}
}





/*
	OUTPUT OF ABOVE CODE

inside static block
val of 'a' in static block before is 1
val of 'b' in static block before is 0
val of 'a' in static block after is 1
val of 'b' in static block after is 3
End of static block
Begin main
inside m1()
val of 'a' in m1() is 1
val of 'b' in m1() is 3
val of 'x' in m1() is 5
End of m1()
End of main
*/