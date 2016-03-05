/* program to use this keyword with instance block */


class  Hello
{
	{
		System.out.println("Inside instance block");
	}
	Hello()
	{
		System.out.println("Inside constructor");
	}
	void m1()
	{
		System.out.println("Inside m1() method");
	}
	void m2()
	{
		System.out.println("Inside m2() method");
	}
	public void finalize()
	{
		System.out.println("Inside finalize() method");
	}
}
class  InstanceBlockDemo
{
	public static void main(String[] args) 
	{
		Hello h=null;
		h=new Hello();
		h.m1();
		h.m2();
		System.gc();
	}
}
