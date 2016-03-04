class Box
{
	static int count = 0;
	Box()
	{
		System.out.println("inside 1st constructor");
		count++;
	}

	Box(int a)
	{
		System.out.println("inside 2nd constructor");
		count++;
	}

	Box(int a, int b)
	{
		System.out.println("inside 3rd constructor");
		count++;
	}

	Box(int a, int b, int c)
	{
		System.out.println("inside 4th constructor");
		count++;
	}
}


class NumberOfObjectsCreated 
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
		System.out.println("number of objects created are "+Box.count);
	}
}
