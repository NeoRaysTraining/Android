/* program to implement how to pass different arguments and parameters */

class Hello
{
	void m1()
	{
		System.out.println("Inside m1");
	}
	void m2(int a)
	{
		System.out.println("Inside m2");
		System.out.println("value of  is"+a);
	}
	Box m3(Box z)
	{
		System.out.println("value of z is"+z);
		System.out.println("value of w in z is"+z.w);
		System.out.println("value of h in z is"+z.h);
		System.out.println("value of d in z is"+z.d);
		z.w*=2;
		z.h*=2;
		z.d*=2;
		System.out.println("value of z is"+z);
		System.out.println("value of w in z is"+z.w);
		System.out.println("value of h in z is"+z.h);
		System.out.println("value of d in z is"+z.d);
		return z;
	}
	Box m4()
	{
		int i=11;
		int j=12;
		int k=13;
		Box  b=new Box(i,j,k);
		System.out.println("value of b is"+b);
		System.out.println("value of w in b is"+b.w);
		System.out.println("value of h in b is"+b.h);
		System.out.println("value of d in b is"+b.d);
		return b;
	}
};

class Box
{
	int w,h,d;
	Box(int x,int y,int z)
	{
		w=x;
		h=y;
		d=z;
	}
	int volume()
	{
		int l;
		l=w*h*d;
		return l;
	}
};

class  DifferentDataArgsAndParamDemo
{
	public static void main(String[] args) 
	{
		Hello h=new Hello();
		h.m1();
		h.m2(4);
		int p=5;
		int q=6;
		int r=7;
		Box b=new Box(p,q,r);
		System.out.println("value of w in b is"+b.w);
		System.out.println("value of h in b is"+b.h);
		System.out.println("value of d in b is"+b.d);
		h.m3(b);
		System.out.println("value of w in b is======"+b.w);
		System.out.println("value of h in b is======"+b.h);
		System.out.println("value of d in b is======"+b.d);
		}
}
