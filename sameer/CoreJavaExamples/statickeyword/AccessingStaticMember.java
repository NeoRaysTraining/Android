class Hello
{
	static int a = 1;	// Static variable
	int b = 2;
//						   STATIC BLOCK	
	static														// Executes only 1ce when the class gets loaded
	{
		System.out.println("inside static block");
		System.out.println("val of 'a' in static block is "+a);	//Can access static member(variable)
																//in static context(static block)

//		System.out.println("val of 'b' in static block is "+b);	//ERROR! : CANNOT access instance 
																//member(variable) in static context(static block)
		System.out.println("End of static block");
	}


//						   INSTANCE BLOCK
	{															// Executes each time when an object is created
		System.out.println("inside instance block");
		System.out.println("val of 'a' in instance block is "+a);//Can access static member(variable)
																 //in instance context(instanbe block)

		System.out.println("val of 'b' in instance block is "+b);//Can access instance member(variable)
																 //in instance context(instanbe block)
		System.out.println("End of instance block");
	}


	Hello()				//Constructor CANNOT be made static & Executes each time when an object is created
	{
		System.out.println("inside constructor");
		System.out.println("val of 'a' in constructor is "+a);
		System.out.println("val of 'b' in constructor is "+b);
		System.out.println("End of constructor");
	}

	static void m1()	//Methods can be made static & Executes everytime the method is called
	{
		System.out.println("inside m1()");
		System.out.println("val of 'a' in m1() is "+a);
//		System.out.println("val of 'b' in m1() is "+b);			//ERROR! : CANNOT access instance member(variable)
																//in static context(static method)
		System.out.println("End of m1()");
	}

	void m2()													//Executes everytime the method is called
	{
		System.out.println("inside m2()");
		System.out.println("val of 'a' in m2() is "+a);
		System.out.println("val of 'b' in m2() is "+b);
		System.out.println("End of m2()");
	}
}


class AccessingStaticMember
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		Hello h = null;
//		h = new Hello();
		h.m1();												   //Can access static member(method)
															   //in main method(static context)
															   //using reference variable,with dot(.) operator,
															   //without creating an object

		System.out.println("val of 'a' in main() is "+h.a);    //Can access static member(variable)
														       //in main method(static context)using reference variable,
														       //with dot(.) operator,without creating an object
		
		System.out.println("val of 'a' in main() is "+Hello.a);//Can access static member(variable)
															   //in main method(static context)using CLASS name,
															   //with dot(.) operator,without creating an object

/*		System.out.println("val of 'b' in main() is "+h.b);		//Error!(Null Pointer Exception).
																//CANNOT access instance member(variable)
															    //in main method(static context)
																//without creating an object

		h.m2();													//Error!(Null Pointer Exception)
																//CANNOT access instance member(method)
																//in main method(static context)
																//without creating an object
*/		System.out.println("End of main");
	}
}





/*
1) Without creating object
	OUTPUT OF ABOVE CODE

Begin main
inside static block
val of 'a' in static block is 1
End of static block
inside m1()
val of 'a' in m1() is 1
End of m1()
val of 'a' in main() is 1
val of 'a' in main() is 1
End of main


2) After creating object
   OUTPUT OF ABOVE CODE

Begin main
inside static block
val of 'a' in static block is 1
End of static block
inside instance block
val of 'a' in instance block is 1
val of 'b' in instance block is 2
End of instance block
inside constructor
val of 'a' in constructor is 1
val of 'b' in constructor is 2
End of constructor
inside m1()
val of 'a' in m1() is 1
End of m1()
val of 'a' in main() is 1
val of 'a' in main() is 1
val of 'b' in main() is 2
inside m2()
val of 'a' in m2() is 1
val of 'b' in m2() is 2
End of m2()
End of main
*/