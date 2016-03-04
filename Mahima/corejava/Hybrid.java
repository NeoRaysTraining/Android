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




class C extends B
  {
	void m3()
	{
 System.out.println("C");
    
	}
	
 };
 class D extends C
  {
	void m4()
	{
 System.out.println("D");
 
	}

 };
class Hybrid 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A a =new A();
		a.m1();
		B b =new B();
		b.m2();
		C c=new C();
		c.m3();
		D d = new D();
		d.m4();
	}
}
