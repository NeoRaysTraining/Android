/*program to implement inheritance and intialize using dot operator */

class A
{
	int x;
	int y;
	void showxy()
	{
		System.out.println("value of x and y is"+x+"\t"+y);
	}
	void m1()
	{
		System.out.println("Inside  A m1() method");
	}
}

class B extends A
{
	int z;
	void showz()
	{
		System.out.println("value of z is "+z);
	}
	void sum()
	{
		System.out.println("sum of x,y,z is"+super.x+"\t"+super.y+"\t"+z);
		System.out.println("sum of x,y,z is"+(x+y+z));
	}
	void m2()
	{
		System.out.println("Inside m2 of b's class");
		m1();
	}
}

class InheritanceDemo
{
	public static void main(String[] args) 
	{
		/*A a= null; //super class reference variable
		a=new A();
		a.x=1;
		a.y=2;
		a.showxy();
		System.out.println("value of x in a is"+a.x);
		System.out.println("value of y in a is"+a.y);
		a.showxy();
		a.m1(); */
		
		B b=null; // sub class reference variable
		b=new B();
		b.x=5;
		b.y=6;
		b.z=7;
		b.showxy();
		b.showz();
		b.sum();
		b.m2();		
	}
}