class Box
{
	int w = 5;
	int h = 6;
	int d = 7;
}

class Hardcode
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

		System.out.println("value of w is "+b.w);
		System.out.println("value of h is "+b.h);
		System.out.println("value of d is "+b.d);
		
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
value of w is 5
value of h is 6
value of d is 7
volume of w,h & d is 210
End of main
*/