/*program to implement instance block */

class Hello
{
	int a;
	{
		System.out.println("Inside Instanc block");
	}
	Hello()
	{
		System.out.println("Inside Constructor");
	}
	void m1()
	{
		System.out.println("Inside m1 method");
	}
};

class InstanceBlockDemo  
{
	public static void main(String[] args) 
	{
		Hello h=null;
		h=new Hello();
		Hello h1=null;
		h1=new Hello();
		h.m1();
		h1.m1();
		}
}
