/* program to implement autopromotion of different datatyes */

class Hello
{
	void m1(byte a)
	{
		System.out.println("inside byte m1()");
		System.out.println("value of a is "+a);
	}
	void m1(short s)
	{
		System.out.println("inside short m1()");
		System.out.println("value of s is "+s);
	}
	void m1(int i)
	{
		System.out.println("inside int m1()");
		System.out.println("value of i is "+i);
	}
	void m1(long l)
	{
		System.out.println("inside long m1()");
		System.out.println("value of l is "+l);
	}
	void m1(float f)
	{
		System.out.println("inside float m1()");
		System.out.println("value of f is "+f);
	}
	void m1(double d)
	{
		System.out.println("inside double m1()");
		System.out.println("value of d is "+d);
	}
};

class AutopromotionDemo1
{
	public static void main(String[] args) 
	{
		Hello h; //creating a reference variable
		h = new Hello(); //creating an instance
		int x=5;
		h.m1(x);
		byte y=6;
		h.m1(y);
		short z=7;
		h.m1(z);
		long l=9;
		h.m1(l);
		float f=5.8f;
		h.m1(f);
		double d=9;
		h.m1(d);
	}
}
