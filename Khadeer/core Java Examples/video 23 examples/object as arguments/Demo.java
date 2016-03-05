/* program to implement how to send user defined data type as arguments */

class Box
{
	int w,h,d;
	int voulme()
	{
		int l;
		l=w*h*d;
		return l;
	}
};

class Demo
{
	public static void main(String[] args) 
	{
		Box b=null;
		b=new Box();
		System.out.println("value of box b is"+b);
		System.out.println("value of w in box b is"+b.w);
		System.out.println("value of h in box b is"+b.h);
		System.out.println("value of d in box b is"+b.d);
		b.w=1;
		b.h=2;
		b.d=3;
		Box b1;
		b1=new Box();
		System.out.println("value of box b1 is"+b1);
		System.out.println("value of w in box b1 is"+b1.w);
		System.out.println("value of h in box b1 is"+b1.h);
		System.out.println("value of d in box b1 is"+b1.d);
		b1.w=4;
		b1.h=5;
		b1.d=6;
		System.out.println("value of box b1 is"+b1);
		System.out.println("value of w in box b1 is"+b1.w);
		System.out.println("value of h in box b1 is"+b1.h);
		System.out.println("value of d in box b1 is"+b1.d);
		Box b2=null;
		System.out.println("value of b2 is"+b2);
		b2=b1;
		System.out.println("value of box b2 is"+b2);
		System.out.println("value of w in box b2 is"+b2.w);
		System.out.println("value of h in box b2 is"+b2.h);
		System.out.println("value of d in box b2 is"+b2.d);
		Box b3;
		b3=b2;
		System.out.println("value of box b3 is"+b3);
		System.out.println("value of w in box b3 is"+b3.w);
		System.out.println("value of h in box b3 is"+b3.h);
		System.out.println("value of d in box b3 is"+b3.d);
		b3.w*=2;
		b3.h*=2;
		b3.d*=2;
		b3.w=10;
		b3.h=20;
		b3.d=30;
		System.out.println("value of w in box b1 is"+b1.w);
		System.out.println("value of h in box b1 is"+b1.h);
		System.out.println("value of d in box b1 is"+b1.d);
		System.out.println("value of w in box b2 is"+b2.w);
		System.out.println("value of h in box b2 is"+b2.h);
		System.out.println("value of d in box b2 is"+b2.d);
	}
}
