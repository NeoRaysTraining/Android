/* program to intialize instance variable of subclass using constructor */

class A
{
	int x; //instance variables
	int y; //instance variables
A(int x,int y)
{
	this.x=x;  //this keyword is used to resolve conflicts between  
	this.y=y;
}
void showxy()
{
	System.out.println("value of x and y is "+x+"\t"+y);
}
void m1()
	{
	System.out.println("Inside m1 method");
}
}

class B extends A
{
	int z;
	B(int x,int y,int z)
	{
		super(x,y); //it is used to invoke super class variables instead of defining again
		this.z=z;
	}
}


class  SuperConstructorDemo
{
	public static void main(String[] args) 
	{
		/*A a=new A(1,2); //passing values to constructor while creating objects
		B b=new B(5,6);
		System.out.println("value of x in a is"+a.x);
		System.out.println("value of y in a is"+a.y);
		a.showxy();
		a.m1(); */

		B b=new B(5,6,7);
		System.out.println("value of x in b is"+b.x);
		System.out.println("value of y in b is"+b.y);
		System.out.println("value of z in b is"+b.z);

	}
}
