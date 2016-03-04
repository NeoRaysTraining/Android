class A
{
	void fun()
	{
System.out.println("A");
	}
};
class B
{
	void fun()
	{
System.out.println("B");
	}
};
class C extends A
{
	void fun()
	{
System.out.println("CA");
	}
};
class C extends B
{
	void fun()
	{
System.out.println("BC");
	}
};

class MultipleInh 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A a=new A();
		a.fun();
		B b= new B();
		b.fun();
		//C c=new C(); //Error:conflicts in Class C objects
      //  c.fun();
		
	}
}
