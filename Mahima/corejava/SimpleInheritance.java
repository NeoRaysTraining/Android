class A
{
	void m1()
	{
		System.out.println("A");
    }
};
class B extends A
{
	void m2()
	{
	System.out.println("B");
	}
};

class SimpleInheritance 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A a = new A();
		a.m1();
		B b =new B();
		b.m2();

	}
}
