class Hello
{
	static int a;

//						   STATIC BLOCK	
	static
	{
		System.out.println("inside static block");			// Executes only 1ce when the class gets loaded
	}

//						   INSTANCE BLOCK
	{
		System.out.println("inside instance block");		// Executes each time when an object is created
	}


	Hello()				//Constructor CANNOT be made static
	{
		System.out.println("inside constructor");			// Executes each time when an object is created
	}

	void m2()
	{
		System.out.println("inside m2()");					// Executes everytime the method is called
	}

	public void finalize()
	{
		System.out.println("inside finalize()");			// Executes 1ce before destroying an object
	}
}


class ExecutionFlow1
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		Hello h = null;
		System.out.println("val of static variable 'a' is "+h.a);
		System.out.println("End of main");
	}
}
