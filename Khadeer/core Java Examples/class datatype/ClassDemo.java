/*program to implement class datatype  and how to create and use objects */

class Box
{
	int w=5;
	int h=6;
	int d=7;
};

class ClassDemo
{
	public static void main(String[] args) 
	{
		int x; //creating reference variable
		x=0; //intializing the premitive variable by providing premetive value

		Box b1;
		b1=new Box();
		System.out.println("value of w in box b1 is"+b1.w);
		System.out.println("value of h in box b1 is"+b1.h);
		System.out.println("value of d in box b1 is"+b1.d);
		x=b1.w*b1.h*b1.d;
		System.out.println("value of box b1 is "+x);


	}
}
