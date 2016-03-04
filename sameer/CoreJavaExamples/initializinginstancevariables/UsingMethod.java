class Box
{
	int w;
	int h;
	int d;

/*	void m1()
	{
		System.out.println("Begin m1()");
		w = 5;
		h = 6;
		d = 7;
		System.out.println("End of m1()");
	}
*/

	void m2(int x, int y, int z)
	{
		System.out.println("Begin m2()");
		w = x;
		h = y;
		d = z;
		System.out.println("End of m2()");
	}


}

class UsingMethod
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		int z;
		Box b;
//		System.out.println("value of z is "+z);	//ERROR : variable z might not have been initialized
//		System.out.println("value of b is "+b);	//ERROR : variable b might not have been initialized
		z = 4;
		b = new Box();
		System.out.println("value of z is "+z);
		System.out.println("value of b is "+b);

		System.out.println("value of w before is "+b.w);
		System.out.println("value of h before is "+b.h);
		System.out.println("value of d before is "+b.d);
		
//		b.m1();
		b.m2(1,2,3);

		System.out.println("value of z is "+z);
		System.out.println("value of b is "+b);

		System.out.println("value of w after is "+b.w);
		System.out.println("value of h after is "+b.h);
		System.out.println("value of d after is "+b.d);
		
		int volume = b.w*b.h*b.d;
		System.out.println("volume of w,h & d is "+volume);
		System.out.println("End of main");
	}
}



/*
	OUTPUT OF ABOVE CODE	

Begin main
value of z is 4
value of b is Box@19e0bfd
value of w before is 0
value of h before is 0
value of d before is 0
Begin m2()
End of m2()
value of z is 4
value of b is Box@19e0bfd
value of w after is 1
value of h after is 2
value of d after is 3
volume of w,h & d is 6
End of main
*/