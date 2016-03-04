class Hello
{
	Hello()
	{
		System.out.println("Inside constructor");
	}

	void m1()
	{
		System.out.println("Inside m1");
	}

	void m2()
	{
		System.out.println("Inside m2");
	}

	void m3()
	{
		System.out.println("Inside m3");
	}
	public void finalize()
	{
		System.out.println("Inside finalize");
	}
}


class Finalize 
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		Hello h1 = null;
		Hello h2 = null;
		Hello h3 = null;
		Hello h4 = null;
		Hello h5 = null;

		h1 = new Hello();
		h2 = new Hello();
		h3 = new Hello();
		h4 = new Hello();
		h5 = new Hello();

		System.gc();

		h1.m1();
		h2.m2();
		h3.m3();

		System.gc();

		h1 = null;
		h2 = h3;
		h4 = new Hello();

		System.gc();


		h5.m1();
		h4.m2();
		h2.m3();

		h5.finalize();
		h4.finalize();
		h2.finalize();

		h5.m1();
		h4.m2();
		h2.m3();
		System.gc();
		System.out.println("End of main");
	}
}




/*
	OUTPUT OF ABOVE CODE

Begin main
Inside constructor
Inside constructor
Inside constructor
Inside constructor
Inside constructor
Inside m1
Inside m2
Inside m3
Inside constructor
Inside m1
Inside m2
Inside m3
Inside finalize
Inside finalize
Inside finalize
Inside m1
Inside m2
Inside m3
Inside finalize
Inside finalize
Inside finalize
End of main
*/