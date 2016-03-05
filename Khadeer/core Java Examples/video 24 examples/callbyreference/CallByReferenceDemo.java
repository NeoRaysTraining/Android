class Box
{
	int w,h,d;
	Box(int x,int y, int z)
	{
		w=x;
		h=y;
		d=z;
	}
}

class CallByReferenceDemo 
{
	public static void main(String[] args) 
	{
Box b=null;
int i=10;
int j=20;
int k=30;
b=new Box(i,j,k);
System.out.println("value of b is"+b);
System.out.println("value of w in b is"+b.w);
System.out.println("value of h in b is"+b.h);
System.out.println("value of d in b is"+b.d);
Box b1=m1(b);
System.out.println("value of b is"+b);
System.out.println("value of w in b is"+b.w);
System.out.println("value of h in b is"+b.h);
System.out.println("value of d in b is"+b.d);
System.out.println("value of b1 is"+b1);
System.out.println("value of w in b1 is"+b1.w);
System.out.println("value of h in b1 is"+b1.h);
System.out.println("value of d in b1 is"+b1.d);
b=m3();
System.out.println("value of b is"+b);
System.out.println("value of w in b after m3 is"+b.w);
System.out.println("value of h in b after m3 is"+b.h);
System.out.println("value of d in b after m3 is"+b.d);
	}
	static Box m1(Box z)
	{

	z.w*=2;
	z.h*=2;
	z.d*=2;
	System.out.println("value of z is"+z);
	System.out.println("value of w in z is"+z.w);
	System.out.println("value of h in z is"+z.h);
	System.out.println("value of d in z is"+z.d);
	return z;
	}
/*	static void m1(Test p)
	{
		System.out.println("value of p is "+p);
		System.out.println("value of x in p is"+p.x);
		System.out.println("value of y in p is"+p.y);
		p.x=11;
		p.y=22;
		System.out.println("value of x in p is"+p.x);
		System.out.println("value of y in p is"+p.y);
	}*/
	static Box m3()
	{
		int p=9;
		int q=9;
		int r=9;
		Box m=new Box(p,q,r);
		System.out.println("value of m is"+m);
		System.out.println("value of w in m is"+m.w);
		System.out.println("value of h in m is"+m.h);
		System.out.println("value of d in m is"+m.d);
		return m;
	}

	}

