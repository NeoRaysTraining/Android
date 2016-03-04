class Hello
{
	static int a;

//						   STATIC BLOCK	
	static
	{
		System.out.println("inside static block");		// Executes only 1ce when the class gets loaded
	}

//						   INSTANCE BLOCK
	{
		System.out.println("inside instance block");	// Executes each time when an object is created
	}


	Hello()				//Constructor CANNOT be made static
	{
		System.out.println("inside constructor");		// Executes each time when an object is created
	}

	void m1()
	{
		System.out.println("inside m1()");				// Executes everytime the method is called
	}

	public void finalize()
	{
		System.out.println("inside finalize()");		// Executes 1ce before destroying an object
	}
}


class ExecutionFlow2
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		Hello h1 = null;
		Hello h2 = null;
		Hello h3 = null;
		
		h1 = new Hello();
		h2 = new Hello();
		h3 = new Hello();
		h1.m1();
		h2.m1();
		h3.m1();
		
		h1 = null;										// Dereferencing an object
		h2 = h3;										// Dereferencing an object
		System.gc();									// Explicitly calling garbage collector
		System.out.println("End of main");
	}
}






/*

	OUTPUT OF ABOVE CODE

Begin main
inside static block				// Executes only 1ce when the class gets loaded
inside instance block			// Executes each time when an object is created
inside constructor				// Executes each time when an object is created
inside instance block
inside constructor
inside instance block
inside constructor
inside m1()						// Executes everytime the method is called
inside m1()
inside m1()
End of main
inside finalize()				// Executes 1ce before an object gets destroyed
inside finalize()
*/