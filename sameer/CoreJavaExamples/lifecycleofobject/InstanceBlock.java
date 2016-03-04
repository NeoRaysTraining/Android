class Hello
{
	int a = 10;
		
	{
		System.out.println("Inside instance block");
	}

	Hello()
	{
		System.out.println("Inside constructor");
	}

	void m1()
	{
		System.out.println("Inside m1");
	}
	public void finalize()
	{
		System.out.println("Inside finalize");
	}
}

class InstanceBlock 
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		Hello h1 = new Hello();
		Hello h2 = new Hello();
		h1 = h2;
//		h1 = new Hello();
//		h2 = new Hello();
		System.gc();
		System.out.println("End of main");
	}
}


/*
	OUTPUT OF ABOVE CODE

Begin main
Inside instance block
Inside constructor
Inside instance block
Inside constructor
End of main
Inside finalize
*/