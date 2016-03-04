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

class C extends B						// Inheriting super class(B) properties in sub class (C)
{
	void m3()
	{
		System.out.println("inside m3");
		m1();							// Using functionality of super class(A) in sub class (B)
		m2();							// Using functionality of super class(B) in sub class (C)
	}
	
}

class Multilevel
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
	}
}