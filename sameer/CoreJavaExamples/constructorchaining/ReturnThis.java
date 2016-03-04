class Hello
{
	Hello()
	{
		System.out.println("inside constructor");

	}
	
	Hello m1()
	{
		System.out.println("inside m1()");
		System.out.println("val of this in m1() is "+this);
		return this;

	}
}
class ReturnThis
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		Hello h = null;
		System.out.println("val of h in main is "+h);
		h = new Hello();
		h = h.m1();
		System.out.println("val of h in main is "+h);
		Hello h1 = null;
		h1 = h.m1();
		System.out.println("val of h1 in main is "+h1);
		System.out.println("End of main");

	}
}



/*
	OUTPUT OF ABOVE CODE


Begin main
val of h in main is null
inside constructor
inside m1()
val of this in m1() is Hello@19e0bfd
val of h in main is Hello@19e0bfd
inside m1()
val of this in m1() is Hello@19e0bfd
val of h1 in main is Hello@19e0bfd
End of main
*/