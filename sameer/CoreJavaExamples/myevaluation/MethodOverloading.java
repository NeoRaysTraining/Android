class SumOfNumbers
{
	int sum;

	void add(int a, int b)
	{
	sum = a+b;
	System.out.println("sum of a & b is = "+sum);	// (1) Add method
	}

	void add(int a, int b, int c)					// (2) Add method (overloaded)
	{
	sum = a+b+c;
	System.out.println("sum of a,b & c is = "+sum);
	}

	void add(int a, int b, int c, int d)			// (3) Add method (overloaded)
	{
	sum = a+b+c+d;
	System.out.println("sum of a,b,c & d is = "+sum);
	}
}

class MethodOverloading
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		SumOfNumbers son = new SumOfNumbers();
		son.add(1,2);							// (1) Add method gets executed
		son.add(1,2,3);							// (2) Add method gets executed
		son.add(1,2,3,4);						// (3) Add method gets executed
	}
}