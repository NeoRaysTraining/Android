class Hello
{
	static int a = 1;
	int b = 2;

//						   STATIC BLOCK	
	static														// Executes only 1ce when the class gets loaded
	{
		System.out.println("inside static block");
		Hello h = new Hello();								  //Creating object of a class in same class
		System.out.println("val of 'b' in static block "+h.b);// Accessing instance member(variable)in static context
		h.m1();												  // Accessing instancemember(variable)in static context
		System.out.println("End of static block");
	}

//						   INSTANCE BLOCK
	{															// Executes each time when an object is created
		System.out.println("inside instance block");
	}


	Hello()					 //Constructor CANNOT be made static & Executes each time when an object is created
	{
		System.out.println("inside constructor");
	}

	void m1()													// Executes everytime the method is called
	{
		System.out.println("inside m1()");
	}
}


class AccInstMembInSticBlk
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		System.out.println("val of 'a' in main() is "+Hello.a);// Accessing static member(variable)
		System.out.println("End of main");
	}
}



/*
	OUTPUT OF ABOVE CODE

Begin main
inside static block
inside instance block
inside constructor
val of 'b' in static block 2
inside m1()
End of static block
val of 'a' in main() is 1
End of main
*/