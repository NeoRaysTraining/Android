class Hi
{
	void product(int p, int q)
	{
		System.out.println("inside product method of Hi");
		int a = p;
		int b = q;
		int result = a*b;
		System.out.println("result = "+result);
	}
}

class Hello extends Hi
{
	void product(int p, int q)			// product method is Overridden
	{
		System.out.println("inside product method of Hello");
		int a = p;
		int b = q;
		int c = 3;
		int result = a*b*c;				// Adding functionality
		System.out.println("result = "+result);
	}
}

class MethodOverriding
{
	public static void main(String[] args) 
	{
		System.out.println("begin main");
		Hi h = new Hello();
		h.product(1,2);					// product method of Hello class gets executed
	}
}
