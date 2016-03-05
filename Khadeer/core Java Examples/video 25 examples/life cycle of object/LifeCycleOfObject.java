/*program to implement lifecycle of object */

class Hello
{
	Hello()
	{
	System.out.println("Inside constructor");
	}
void m1()
{
	System.out.println("Inside m1 method");
}
void m2()
{
	System.out.println("Inside m2 method");
}
void m3()
{
	System.out.println("Inside m3 method");
}
public void finalize()
{
	System.out.println("Inside finalize method+++");
}
}

class  LifeCycleOfObject
{
	public static void main(String[] args) 
	{
		System.out.println("Inside begin of main()");
		Hello h1=null;
		Hello h2=null;
		Hello h3=null;
		Hello h4=null;
		Hello h5=null;
		h1=new Hello();
		h2=new Hello();
		h3=new Hello();
		h4=new Hello();
		h5=new Hello();
		System.gc();
		h1.m1();
		h2.m1();
		h3.m1();
		h4.m1();
		h1=null;
		h2=h3;
		System.gc();
		System.out.println("end of main");
	}
}
