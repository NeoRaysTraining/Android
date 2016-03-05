/* program to implement multilevel inheritance */

class A   //super class
{
	A()
	{
		System.out.println("Inside A's Constructor");
	}
}

class B extends A //sub class of A and super class for c
{
	B()
	{
		System.out.println("Inside B's Constructor");
	}
}
class C extends B //sub class for B 
{
	C()
	{
		System.out.println("Inside c's constructor");
	}
}
 
class  MultilevelInheritanceDemo
{
	public static void main(String[] args) 
	{
		//A a=new A();    //creating instance of A class
		//B b=new B();    //creating instance of B class
		C c=new C();    //creating instance of C class

	}
}

//note : invoking class C will implicitly call class A and class B 