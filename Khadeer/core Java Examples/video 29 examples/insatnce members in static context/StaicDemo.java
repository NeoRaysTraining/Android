/* program to add members into a class which contains main method i.e..members are as static variables , static block , static methods */

class StaicDemo
{
	static int a=5;
	static int b;
	static
	{
		System.out.println("Inside static block");
		b=a*3;
	}
	static void m1(int x)
	{
		System.out.println("value of a in m1"+a);
		System.out.println("value of b in m1"+b);
		System.out.println("value of x in m1"+x);
	}
	public static void main(String[] args) 
	{
		System.out.println("Inside Main");
		m1(5);
	}
}
