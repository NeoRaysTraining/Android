/* program to implemenet method overloading */

class  Hello
{
	void test()
	{
		System.out.println("no params");
	}
	void test(int a)
	{
		System.out.println("value of a is"+a);
	}
	void test(int a,double d)
	{
		System.out.println("value of int a and double d is"+a+"\t"+d);
	}
	void test(double d,int a)
	{
		System.out.println("value of double d and int a is"+d+"\t"+a);
	}
	void test(double d)
	{
		System.out.println("value of double d is "+d);
	}
}
class MethodOverloadDemo
{
	public static void main(String[] args) 
	{
		Hello h; //creating a reference variable
		h=new Hello();
		h.test();
		h.test(5);
		h.test(5,9.2);
		h.test(9.8,2);
		h.test(5.6);
	}
}
