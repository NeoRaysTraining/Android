/* program to implement simple inheritance */

class A //super class
{
	A()
	{
	System.out.println("Inside A's Constructor");
	}
}

class B extends A//sub class
{
	B()
	{
		System.out.println("Inside B's constructor");
	}
}
class InheritanceDemo 
{
	public static void main(String[] args) 
	{
		A a =new A(); //creating super class instance
		//B b=new B(); //creating sub class instance
	}
}


//note : when we create subclass instance it will implicitly invoke superclass