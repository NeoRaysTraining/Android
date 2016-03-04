class Hi
{
	public void product(int p, int q)
	{
		System.out.println("inside product method of Hi");
		int a = p;
		int	b = q;
		int result;
		result = a*b;
		System.out.println("result = "+result);
	}
}

class Hello extends Hi
{
	public void product(int p, int q)
	{
		System.out.println("inside product method of Hello");
		int a = p;
		int b = q;
		int c = 3;
		int result;
		result = a*b*c;
		System.out.println("result = "+result);
	}
}

class  MethodOverride
{
	public static void main(String[] args) 
	{
		System.out.println("Begin Main");
		Hi h = new Hello();
		h.product(1,2);



	}
}
