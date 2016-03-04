class A
{
	void m1()
	{
		System.out.println("inside m1");
	}
}

class B extends A						// Inheriting super class(A) properties in sub class (B)
{
	void m2()
	{
		System.out.println("inside m2");
		m1();							// Using functionality of super class(A) in sub class (B)
	}
	
}

class Simple
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		B b = new B();
		b.m2();
		b.m1();
	}
}
