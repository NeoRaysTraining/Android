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

class D extends B						// Inheriting super class(B) properties in sub class (D)
{
	void m4()
	{
		System.out.println("inside m4");
		m1();							// Using functionality of super class(A) in sub class (D)
		m2();							// Using functionality of super class(B) in sub class (D)
	}
	
}

class Hybrid
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		D d = new D();
		d.m1();
		d.m2();
		d.m4();
		C c = new C();
		c.m1();
		c.m3();
	}
}