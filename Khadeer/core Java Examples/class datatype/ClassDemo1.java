/* program to implement class by defining methods in main & call it by method name*/
class Box
{
	int w,h,d;
	void fun(int x,int y,int z)
	{
		w=x;
		h=y;
		d=z;
	}
	int volume()
	{
		int l;
		l=w*h*d;
		System.out.println("volume of box b is"+l);
		return l;
	}
};

class  ClassDemo1
{
	public static void main(String[] args) 
	{
		Box b;
		b= new Box(); //creating an object
		b.fun(1,2,3);
		System.out.println("value of w in box b is"+b.w);
		System.out.println("value of h in box b is"+b.h);
		System.out.println("value of d in box b is"+b.d);
		b.volume();

		Box b1;
		b1=new Box();
		b1.fun(4,5,6);
		System.out.println("value of w in box b is"+b1.w);
		System.out.println("value of h in box b is"+b1.h);
		System.out.println("value of d in box b is"+b1.d);
		b1.volume();
	}
}