/*program to implement simple inhertance */
class A
{
A()
	{
	System.out.println("Inside A's Constructor");
	}
}
class B extends A
{
	B()
	{
		System.out.println("Inside B's constructor");
	}
}

class SimpleInheritance 
{
	public static void main(String[] args) 
	{
		//A a=new A();
		B b=new B();
	}
}
