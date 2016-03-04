class Box
{
	int w;
	int h;
	int d;
	Box(int x, int y, int z)
	{
		w = x;
		h = y;
		d = z;
	}

	int volume()
	{
		System.out.println("Begin m1()");
		int l;
		l = w*h*d;
		System.out.println("value of w is "+w);
		System.out.println("value of h is "+h);
		System.out.println("value of d is "+d);
		System.out.println("value of l is "+l);
		System.out.println("End of m1()");
		return l;
	}
}
class LocalAccess
{
	public static void main(String[] args) 
	{
		Box b = new Box(1,2,3);
		int v = b.volume();
	}
}



/*
	OUTPUT OF ABOVE CODE

Begin m1()
value of w is 1
value of h is 2
value of d is 3
value of l is 6
End of m1()
*/