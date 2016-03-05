/* program to implement how to send primitives as arguments*/
class Hello
{
	void m1()
	{
		System.out.println("Inside m1");
	}
	void m2(int a)
	{
		System.out.println("Inside m2 value of a is"+a);
	}
	void m3(int a,double d)
	{
		System.out.println("Inside m3 value a and s is"+a+"\t"+d);
	}
	int m4()
	{
		int a=5;
		System.out.println("Inside m4");
		return a;
	}
	int m5(int a)
	{
		System.out.println("Inside m5");
		System.out.println("value of  a is"+a);
		a*=2;
		return a;
	}
	int m6(int a, int b, boolean c)
	{
		System.out.println("Inside m6");
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
		System.out.println("value of c is "+c);
		int z=a+b;
		return z;
	}
};

class Demo
{
	public static void main(String[] args) 
	{
		Hello h= new Hello();
		h=new Hello();
		h.m1();
		int p=10;
		h.m2(p);
		int q=2;
		double r=3.0;
		h.m3(2,3.0);
		h.m4();
		int s=8;
		h.m5(5);
		int y=h.m6(10,5,false);
		System.out.println(y);
	}
}
