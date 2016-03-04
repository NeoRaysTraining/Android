class Hello
{
	Hello()
	{
		System.out.println("Inside constructor");
	}

	void test()
	{
		System.out.println("no parameters");
	}

/*	void test(int a)
	{
		System.out.println("value of int 'a' is "+a);
	}
*/
	void test(int a, double d)
	{
		System.out.println("value of int 'a' & double 'd' is "+a+" & "+d);		
	}

	void test(double d,int a)
	{
		System.out.println("value of double 'd' & int 'a' is "+d+" & "+a);
	}

	void test(double d)
	{
		System.out.println("value of double 'd' is "+d);
	}

	int test(int a)
	{
		System.out.println("value of int 'a' with return type int is "+a);
		a*=2;
		return a;
	}

	int[] test(int b[])
	{
		System.out.println("value of array b is "+b);
		int c[]=b;
		System.out.println("value of array c is "+c);
		return c;
	}
}

class MethodOverloading 
{
	public static void main(String[] args) 
	{
		Hello h = new Hello();
		int s = h.test(5);
		System.out.println("value of s is "+s);
		h.test(1.5,2);
		h.test();
		h.test(4,2.7);
		h.test(3.6);
		int f[]={10,20,30,40,50};
		int g[]=h.test(f);
		System.out.println("value of array f is "+f);
		System.out.println("value of array g is "+g);


	}
}




Inside constructor
value of int 'a' with return type int is 5
value of s is 10
value of double 'd' & int 'a' is 1.5 & 2
no parameters
value of int 'a' & double 'd' is 4 & 2.7
value of double 'd' is 3.6
value of array b is [I@19e0bfd
value of array c is [I@19e0bfd
value of array f is [I@19e0bfd
value of array g is [I@19e0bfd