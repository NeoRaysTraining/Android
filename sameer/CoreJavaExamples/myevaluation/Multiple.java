interface A
{
	public static final int a = 10;
	abstract void m1();
}

interface B
{
	public static final int b = 20;
	abstract void m2();
}

class C implements A,B						// class C implements interface A & B
{
	public void m1()
	{
		System.out.println("inside m1()");
	}

	public void m2()
	{
		System.out.println("inside m2()");
	}
}

class Multiple
{
	public static void main(String[] args) 
	{
		C c = new C();
		c.m1();
		c.m2();
	}
}