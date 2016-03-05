/*program to implement instance blocks */

class Hello
{
	{
	System.out.println("Inside instance block");
	}
Hello()
{
	System.out.println("Inside Constructor");
}
void m1()
{
	System.out.println("Inside m1 method()");
}
void m2()
{
	System.out.println("Begin m2() method");
	{
		System.out.println("Local Block");
	}
	System.out.println("End of m2() method");
}
public void finalize()
{
	System.out.println("Inside finalize() method");
}
}

class  InstanceBlockDemo1
{
	public static void main(String[] args) 
	{
		Hello h1=null;
		h1=new Hello();
		Hello h2=null;
		h2=new Hello();
		Hello h3=null;
		h3=new Hello();
		h1.m1();
		h2.m1();
		//h1=null;
		//h2=null;
		h1.m2();
		h2.m2();
		System.gc();
	}
}
