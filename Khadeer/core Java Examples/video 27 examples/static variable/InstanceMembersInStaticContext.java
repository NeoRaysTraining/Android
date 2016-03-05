/* how to access instance members in static context */

class Hello
{
	static int x=5;
	int y=9;
	static 
		{
		System.out.println("imside static block");
		}
		static void m1()
			{
			System.out.println("Inside m1 method");
			System.out.println("value of x in m1() method is"+x);
			//System.out.println("value of y in m1() method is"+y); // gives error bcoz the method is declared as static as non static variables cannot be accesed
			Hello h=new Hello();// so by creating objects we can access non static variables in static context
			System.out.println("value of y in m1() method is"+h.y); //hence y is accessed with h.y
			}
		void m2()
		{
			System.out.println("value of x in m2() method is"+x);
			System.out.println("value of y in m2() method is"+y);
		}
}

class  InstanceMembersInStaticContext
{
	public static void main(String[] args) 
	{
		Hello.m1();
		Hello h=new Hello(); //we need to create object to access instance members
		h.m2();
	}
}
