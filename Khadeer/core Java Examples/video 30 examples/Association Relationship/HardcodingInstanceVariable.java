/* program to intialize instance variable in a class by hard coding */

class Hello
{
	int x;
	int y;
	Test t;
	{
		x=10;
		y=20;
		t=new Test(5);
	}
	void fun()
	{
		System.out.println("value of x is"+x);
		System.out.println("value of y is"+y);
		System.out.println("value of p in t is"+t.p);
		t.m1();
	}
}
class Test
{
	int p;
	Test (int p)
	{
		this.p=p;
	}
	void m1()
	{
		System.out.println("value of p is"+p);
	}
}
class HardcodingInstanceVariable 
{
	public static void main(String[] args) 
	{
		Hello h=null;
		h=new Hello();
		System.out.println(h.x);
		System.out.println(h.y);
		h.fun();
		System.out.println(h.t);
		System.out.println(h.t.p);
		h.t.m1();
	}
}
