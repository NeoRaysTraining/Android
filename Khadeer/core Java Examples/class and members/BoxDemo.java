/*program to implement class and assigning the values using . dot operator*/
class Box
{
	int w;
	int h;
	int d;
};
class BoxDemo 
{
	public static void main(String[] args) 
	{
	/*	Box b;  //declaring a reference variale
		b=new Box(); //creating an object
		System.out.println("value of b is"+b);
		System.out.println("value of w in b is:"+b.w);
		System.out.println("value of h in b is:"+b.h);
		System.out.println("value of d in b is:"+b.d);
		b.w=1;
		b.h=2;
		b.d=3;
		System.out.println("value of b is"+b);
		System.out.println("value of w in b is:"+b.w);
		System.out.println("value of h in b is:"+b.h);
		System.out.println("value of d in b is:"+b.d);
		int vol=b.w*b.h*b.d;
		System.out.println("volume of box  b is:"+vol); */

		Box b1; //declaring a reference variable
		b1=new Box(); //creating an object
		System.out.println("value of b1 is"+b1);
		System.out.println("value of w in b1 is:"+b1.w);
		System.out.println("value of h in b1 is:"+b1.h);
		System.out.println("value of d in b1 is:"+b1.d);
		int vol=b1.w*b1.h*b1.d;
		System.out.println("volume of box  b1 is:"+vol);
		b1.w=4;
		b1.h=5;
		b1.d=6;
		System.out.println("value of b1 is"+b1);
		System.out.println("value of w in b1 is:"+b1.w);
		System.out.println("value of h in b1 is:"+b1.h);
		System.out.println("value of d in b1 is:"+b1.d);
		int vol1=b1.w*b1.h*b1.d;
		System.out.println("volume of box  b1 is:"+vol1);
	}
}


/* Box b=new Box(); //declaring ,creating an object and intializing the reference variale */