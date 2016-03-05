/* program to implement conflicts between super class instance variable and sub class instance variable */

class A
{
	int x;
	void m1()
	{
		System.out.println("value of x in A is"+x);
	}
}

class B extends A
{
	int x;
	void m2(int x)
	{
		x=x;
		this.x=x;
		super.x=x;
	}
	 fun()
	{
		System.out.println(x);
		System.out.println(super.x);
	}
}

class  ConflictsbetweenSuperclassInstanceVariableAndSubclassInstanceVariable
{
	public static void main(String[] args) 
	{
		A a=new A();
		a.x=10;
		a.m1();
		B b=new B();
		b.x=5;
		b.m1();
		b.m2();
		b.fun(5,6);
	}
}
