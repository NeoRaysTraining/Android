/* program to implement Association Relationship */

class Hello
{
	int x;
	int y;
	Hello(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void fun()
	{
		System.out.println("value of x is"+x);
		System.out.println("value of y is"+y);
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

class AssociationDemo 
{
	public static void main(String[] args) 
	{
		Hello h=null;
		h=new Hello(1,2);
		System.out.println(h.x);
		System.out.println(h.y);
		h.fun();
		Test t = null;
		t = new Test(4);
		System.out.println(t); //value is null
		System.out.println(t.p);
		//System.out.println(h.t.m1());//raises null pointer exception
	}
}
