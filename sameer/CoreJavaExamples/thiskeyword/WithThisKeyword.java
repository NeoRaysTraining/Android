class Box
{
	int w,h,d;
	Box(int w, int h, int d)
	{
		System.out.println("val of w is "+w);
		System.out.println("val of h is "+h);
		System.out.println("val of d is "+d);

		System.out.println("val of this is "+this);
		System.out.println("val of this.w is "+this.w);
		System.out.println("val of this.h is "+this.h);
		System.out.println("val of this.d is "+this.d);

		this.w = w;
		this.h = h;
		this.d = d;

		System.out.println("val of w is "+w);
		System.out.println("val of h is "+h);
		System.out.println("val of d is "+d);

		System.out.println("val of this is "+this);
		System.out.println("val of this.w is "+this.w);
		System.out.println("val of this.h is "+this.h);
		System.out.println("val of this.d is "+this.d);
	}
}
class WithThisKeyword
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		Box b1 = new Box(1,2,3);
		System.out.println("End of main");
	}
}


/*
	OUTPUT OF ABOVE CODE

Begin main
val of w is 1
val of h is 2
val of d is 3
val of this is Box@19e0bfd
val of this.w is 0
val of this.h is 0
val of this.d is 0
val of w is 1
val of h is 2
val of d is 3
val of this is Box@19e0bfd
val of this.w is 1
val of this.h is 2
val of this.d is 3
End of main
*/