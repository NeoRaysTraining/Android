class Box
{
	static int count = 0;
	Box()
	{
		System.out.println("inside 1st constructor");
	}

	Box(int a)
	{
		System.out.println("inside 2nd constructor");
	}

	Box(int a, int b)
	{
		System.out.println("inside 3rd constructor");
	}

	Box(int a, int b, int c)
	{
		System.out.println("inside 4th constructor");
	}

	public void finalize()
	{
		count++;
		System.out.println("inside finalize()");
		System.out.println("number of objects Dereferenced are "+count);  //??????
	}
}


class NumberOfObjectsDereferenced 
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main()");
		Box b1 = new Box();
		b1 = null;
		Box b2 = new Box(1);
		b1 = b2;
		Box b3 = new Box(1,2);
		b2 = b3;
		Box b4 = new Box(1,2,3);
		b3 = b4;
		b4 = new Box();
		b3 = new Box(1);
		b4 = null;
		b3 = null;
		b2 = null;
		System.gc();
//		System.out.println("number of objects Dereferenced are "+Box.count); //??????
		System.out.println("End of main()");
	}
}
