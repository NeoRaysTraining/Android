/* program to implement constructor overloading */

class Box
{
	int w,h,d;
	Box(int x,int y,int z)
	{
		w=x;
		h=y;
		d=z;
	}
	Box(int x)
	{
		w=x;
		h=x;
		d=x;
	}
	Box(int x,int y)
	{
		w=x;
		h=y;
		d=10;
	}
	int volume()
	{
		int l;
		l=w*h*d;
		return l;
	}
};
class  ConstructorOverloadDemo
{
	public static void main(String[] args) 
	{
		Box b1;
		b1=new Box(1,2,3);
		System.out.println("value of w in b1 is"+b1.w);
		System.out.println("value of h in b1 is"+b1.h);
		System.out.println("value of d in b1 is"+b1.d);
		int x=b1.volume();
		System.out.println("volume of box b1 is"+x);

		Box b2;
		b2=new Box(5);
		System.out.println("value of w in b2 is"+b2.w);
		System.out.println("value of h in b2 is"+b2.h);
		System.out.println("value of d in b2 is"+b2.d);
		int y=b2.volume();
		System.out.println("volume of box b2 is"+y);

	
		Box b3;
		b3=new Box(2,3);
		System.out.println("value of w in b3 is"+b3.w);
		System.out.println("value of h in b3 is"+b3.h);
		System.out.println("value of d in b3 is"+b3.d);
		int z=b3.volume();
		System.out.println("volume of box b3 is"+z);

	}
}
