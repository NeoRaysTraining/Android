/* program to implement inheritance with the blocks */

class A    //super class
{
	static   //static block
	{
		System.out.println("Inside A's static Block");
	}
	{     // Instance Block
		System.out.println("Inside A's Instance Block");
	}
	A()   //Constructor
	{
		System.out.println("Inside A's Constructor");
	}
}

class B extends A//sub class of A and super class C
{
	static   //static block
	{
		System.out.println("Inside B's static Block");
	}
	{   //instance block
		System.out.println("Inside B's Instance Block");
	}
	B()  //constructor
	{
		System.out.println("Inside B's Constructor");
	}
}

class C extends B //sub class of B
{
	static  // static block
	{
		System.out.println("Inside c's Static block");
	}
	{   //instance block
		System.out.println("Inside c's Instance Block");
	}
	C()   //constructor
	{
		System.out.println("Inside C's Constructor");
	}
}

class InheritanceBlockDemo
{
	public static void main(String[] args) 
	{
		//A a=new A();
		//B b=new B();
		C c=new C();
	}
}


//note : always static block executes first then Instance block and constructor gets executed