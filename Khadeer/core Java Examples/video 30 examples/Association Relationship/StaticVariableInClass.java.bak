/*program to implement a class when it has static variables */

class Hello
{
	int x;
	int y;
	static Test t=new Test(5);
	Hello()
	{
		System.out.println("Inside Hello constructor");
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


class StaticVariableInClass 
{
	public static void main(String[] args) 
	{
		System.out.println(Hello.t);
		System.out.println(Hello.t.p);
		Hello.t.m1();
	}
}
