class ArrayArgparaDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int a[]={11,22,33,44,55,66,77};
		//System.out.println(a);
	//System.out.println(a.length);
	//m1(a);
	int x[]=m1(a);

	for(int i:a)
		{
	System.out.println(i);
		}

	}

	static int[] m1(int []x)
	{
		int z[]={9,8,7,6,5,4,3,2};
		return z;
		//System.out.println(x);
	//System.out.println(x.length);
	/*	for(int i:x)
		{
	System.out.println(i);
		}*/

	}
}
