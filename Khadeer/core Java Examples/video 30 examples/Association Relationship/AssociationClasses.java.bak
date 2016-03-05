/*program to implement Association between classes */
class Hello
{
	int x=10;
	int y=20;
	Test t=new Test(5);
	void show()
	{
		System.out.println("Inside show");
		System.out.println("value of x in show is"+x);
		System.out.println("value of y in show is"+y);
	}
}
class Test
{
	int p;
	Test(int p)
	{
		this.p=p;
	}
	void m1()
	{
		System.out.println("Inside m1()");
		System.out.println("value of p in m1 is"+p);
	}
}

class AssociationClasses
{
	public static void main(String[] args) 
	{
		Hello h=null;
		h=new Hello();
		System.out.println("value of x is "+h.x);
		System.out.println("value of y is"+h.y);
		System.out.println("value of t is "+h.t);
		h.x=10;
		h.y=20;
		h.t=new Test(5);
		System.out.println("value of x is "+h.x);
		System.out.println("value of y is"+h.y);
		System.out.println("value of t is"+h.t);
		System.out.println("value of p is"+h.t.p);
	}
}
