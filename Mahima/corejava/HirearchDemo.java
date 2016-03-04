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
class C extends A
  {
	void m3()
	{
 System.out.println("C");
    
	}
  }
class HirearchDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A a =new A();
		a.m1();
		B b=new B();
		b.m2();
		C c=new C();
		c.m3();
	}
}
