class Hello
{
	int w,h,d;

	private Hello(int w)
	{
		this.w = w;										//1st Initializes 'w'
		System.out.println("inside 1st constructor");	//Executes 1st
		System.out.println("val of w is "+w);
		System.out.println("val of h is "+h);
		System.out.println("val of d is "+d);
	}

	private Hello(int w, int h)
	{
		this(w);										// Invokes 1st constructor
		System.out.println("inside 2nd constructor");	//Executes 2nd
		this.h = h;										//2nd Initializes 'h'
		System.out.println("val of w is "+w);
		System.out.println("val of h is "+h);
		System.out.println("val of d is "+d);
	}

	Hello(int w, int h, int d)
	{
		this(w,h);										// Invokes 2nd constructor
		System.out.println("inside 3rd constructor");	//Executes 3rd
		this.d = d;										//3rd Initializes 'd'
		System.out.println("val of w is "+w);
		System.out.println("val of h is "+h);
		System.out.println("val of d is "+d);
	}
}


class ConstructorChaining
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		Hello h = new Hello(1,2,3);						// Creates object,Invokes 3rd constructor
		System.out.println("End of main");

	}
}


/*
	OUTPUT OF ABOVE CODE

Begin main
inside 1st constructor
val of w is 1
val of h is 0
val of d is 0
inside 2nd constructor
val of w is 1
val of h is 2
val of d is 0
inside 3rd constructor
val of w is 1
val of h is 2
val of d is 3
End of main
*/