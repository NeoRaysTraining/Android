class Hello
{
	Hello()
	{
		this(10,"Harish");								// Invokes 2nd constructor
		System.out.println("inside 1st constructor");
	}

	Hello(int w, String h)
	{
		this(w,h,5.6);									// Invokes 3rd constructor
		System.out.println("inside 2nd constructor");
		System.out.println("val of w is "+w);
		System.out.println("val of h is "+h);
	}

	Hello(int w, String h,double d)
	{
		System.out.println("inside 3rd constructor");
		System.out.println("val of w is "+w);
		System.out.println("val of h is "+h);
		System.out.println("val of d is "+d);
	}
}


class ConstructorChaining2
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		Hello h1 = new Hello();					// Creates object,Invokes 3rd constructor
		h1 = new Hello(20,"Bhaskar");
		h1 = new Hello(30,"jitender",7.8);
		System.out.println("End of main");
	}
}



/*
	OUTPUT OF ABOVE CODE

Begin main
inside 3rd constructor
val of w is 10
val of h is Harish
val of d is 5.6
inside 2nd constructor
val of w is 10
val of h is Harish
inside 1st constructor
inside 3rd constructor
val of w is 20
val of h is Bhaskar
val of d is 5.6
inside 2nd constructor
val of w is 20
val of h is Bhaskar
inside 3rd constructor
val of w is 30
val of h is jitender
val of d is 7.8
End of main
*/