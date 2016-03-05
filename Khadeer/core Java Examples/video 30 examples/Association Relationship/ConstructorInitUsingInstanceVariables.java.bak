/*program to intialize instance variable ina class using constructor */

class Hello
{
	int x;
	int y;
	Test t;
	Hello(int x,int y,Test t)
	{
		this.x=x;
		this.y=y;
		this.t=t;
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
	Test(int p)
	{
		this.p=p;
	}
	void m1()
	{
		System.out.println("value of p is"+p);
	}
}


class  ConstructorInitUsingInstanceVariables
{
	public static void main(String[] args) 
	{
		int p=10;
		int q=20;
		//Hello h=new Hello(p,q,new Test(5)); //alternative to the below line
		Test t=new Test(5);
		Hello h=new Hello(p,q,t);
		System.out.println(h.x);
		System.out.println(h.y);
		System.out.println(h.t.p);

		
	}
}
