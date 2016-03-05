/* program to implement conflicts between super class instance variable and sub class local variable */

class A
{
	int x;
}
class B extends A
{
	void m1()
	{
		int x=5;
		System.out.println(x);
		System.out.println(super.x);
	}
}

class  SuperClassInstanceVariableAndSubClassLocalVariable
{
	public static void main(String[] args) 
	{
		A a=new A();
		a.x=10;
		B b=new B();
		b.x=55;
		b.m1();
	}
}
