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

class C extends A						// Inheriting super class(A) properties in sub class (C)
{
	void m3()
	{
		System.out.println("inside m3");
		m1();							// Using functionality of super class(A) in sub class (c)
	}
	
}

class Hierarchial
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		B b = new B();
		b.m1();
		b.m2();
		C c = new C();
		c.m1();
		c.m3();
	}
}