/*program to implement class and intialize values using method*/

class  Box
{
	int w,h,d; //instance variables
	void func(int x,int y,int z)
	{
		w=x;
		h=y;
		d=z;
	}
}
class Demo
{
	public static void main(String[] args) 
	{
		int x;  //creating reference variable
		x=0; //intializing the variable with primitve value
		Box b;
		b=new Box();
		System.out.println("value of box b is"+b);
		System.out.println("value of w in box b is"+b.w);
		System.out.println("value of h in box b is"+b.h);
		System.out.println("value of d in box b is"+b.d);
		Box b1;
		b1=new Box();
		b1.func(1,2,3);
		System.out.println("value of box b1 is"+b);
		System.out.println("value of w in box b1 is"+b1.w);
		System.out.println("value of h in box b1 is"+b1.h);
		System.out.println("value of d in box b1 is"+b1.d);
		Box b2;
		b2=new Box();
		b2.func(4,5,6);
		System.out.println("value of box b2 is"+b);
		System.out.println("value of w in box b2 is"+b2.w);
		System.out.println("value of h in box b2 is"+b2.h);
		System.out.println("value of d in box b2 is"+b2.d);
		int vol=b2.w*b2.h*b2.d;
		System.out.println("volume of box b2 is"+vol);

	}
}
