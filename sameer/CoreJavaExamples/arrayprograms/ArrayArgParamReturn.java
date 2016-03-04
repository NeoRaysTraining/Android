class ArrayArgParamReturn 
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");

/*		int a[];				// (1)---> Declaring an Array

		int []a;				// Another way of declaring an Array

		System.out.println(a);	// Error : Variable not initialized

		a=new int[5];			// Creating an Array
*/
		int a[]=new int[5];		// (2)---> Declaring & Initalizing an Array in single line

		System.out.println("Length of 'a' Array is " + a.length);	// Prints length of an Array

		System.out.println("Value of 'a' is " +a);					// Prints Address

		a[0]=100;
		a[1]=101;
		a[2]=102;				// Initializing Array
		a[3]=103;
		a[4]=104;

		System.out.println("");

//		int a[]={100,101,102,103,104};				// (3)---> Declaring,Creating & Initializing an Array in single line

		int p2=a[2];								// Value in a[2] is copied into p2

		System.out.println("Value of p2 is " + p2);	// Accessing single value

		for (int i:a)			// Enhanced for loop
		{
			System.out.println("Value of 'i' is "+i);	// Accessing all the values
		}

		System.out.println("");
		
		int x[];				// Declaring another Array

		x = a;					// Giving Address of 'a' to 'x',i,e 'x' Refers to Array 'a'

		System.out.println("Length of 'x' Array is " + x.length);	// Prints length of an Array

		for (int j:x)			// Enhanced for loop
		{
			System.out.println("Value of 'j' is "+j);	// Accessing all the values
		}

		System.out.println("");

		System.out.println("Value of x is "+x);		// Prints Address

		x[2]=555;

		System.out.println("Value of x in 2nd index is "+x[2]);

		System.out.println("Value of a in 2nd index is "+a[2]);

		m1(a);					// Passing Array 'a' as an argument

/*		int z[]=m1(a);			// Accepting Return type

		for (int l:z)			// Enhanced for loop
		{
			System.out.println("Value of 'l' is "+l);	// Accessing all the values
		}
*/
		System.out.println("End of main");			
	}

//	static void m1(short s[])			// Data Type Array should match(AutoPromotion do not work)
	static int[] m1(int y[])
	{
		System.out.println("inside m1");

		System.out.println("Length of y Array is " + y.length);

		for (int k:y)			// Enhanced for loop
		{
			System.out.println("Value of 'k' is "+k);	// Accessing all the values
		}

		System.out.println("End of m1()");

		return y;
	}

}