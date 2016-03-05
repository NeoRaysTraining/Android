/* program to intialize instance variable in a class using method */

class Hello
{
	int x;
	int y;
	Test t;
	void math(int x,int y,Test t)
	{
		this.x=x;
		this.y=y;
		this.t=t;
	}
	void fun()
	{
		System.out.println("value of x is"+x);
		System.out.println("value of y is"+y);
		System.out.println("value of t in p is"+t.p);
		t.m1();
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
		System.out.println("value of p is"+p);
	}
}

class InstanceVariableInitUsingMethd 
{
	public static void main(String[] args) 
	{
		int p=10;
		int q=20;
		Hello h=null;
		h=new Hello();
		System.out.println(h.x);
		System.out.println(h.y);
		System.out.println(h.t);
		Test t=new Test(5);
		h.math(p,q,t);

		}
}
