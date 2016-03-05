/*program to implement call by reference */

class Box
{
	static void m1(Box z)
	{
	System.out.println("value of z is "+z);
	System.out.println("value of w in z is "+z.w);
	System.out.println("value of h in z is "+z.h);
	System.out.println("value of d in z is "+z.d);
	z.w*=2;
	z.h*=2;
	z.d*=2;
	System.out.println("value of z is "+z);
	System.out.println("value of w in z is "+z.w);
	System.out.println("value of h in z is "+z.h);
	System.out.println("value of d in z is "+z.d);
	return z;
	}
};


class  CallByReferenceDemo1
{
	public static void main(String[] args) 
	{
	Box b=null;
	int i=10;
	int j=20;
	int k=30;
	b=new Box(i,j,k);
	/*System.out.println("value of b is "+b);
	System.out.println("value of w in b is "+b.w);
	System.out.println("value of h in b is "+b.h);
	System.out.println("value of d in b is "+b.d);*/
	Box b1=null;
	b1=m1(b);
}
}
