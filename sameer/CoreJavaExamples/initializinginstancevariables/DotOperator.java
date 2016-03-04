class Box
{
	int w;
	int h;
	int d;
}

class DotOperator
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

		b.w = 5;
		b.h = 6;
		b.d = 7;

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
value of z is 4
value of b is Box@19e0bfd
value of w after is 5
value of h after is 6
value of d after is 7
volume of w,h & d is 210
End of main
*/