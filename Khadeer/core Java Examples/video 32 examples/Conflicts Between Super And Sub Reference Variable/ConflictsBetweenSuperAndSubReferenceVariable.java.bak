/* program to implement conflicts between superclass and subclass reference variables  and intialize values with method */

class A
{
	int x;
	void m1()
	{
		System.out.println("value of x is"+x);
	}
}

class B extends A
{
	int x;
	void m2()
	{
		System.out.println("value of x is"+x);
		System.out.println("value of x is"+super.x);
	}
	void fun(int p,int q)
	{
		x=p;
		super.x=q;
	}
}
class ConflictsBetweenSuperAndSubReferenceVariable
{
	public static void main(String[] args) 
	{
		/*A a=new A();
		a.x=10;
		a.m1();*/
		B b=new B();
		b.fun(5,6);
		b.m1();
		b.m2();
	}
}
