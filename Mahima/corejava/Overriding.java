class A
{
	void display()
	{
System.out.println("A");
	}
	};

class B extends A
	{
		void display()
		{
		System.out.println("B");
	}
	
	};
class Overriding 
{
	public static void main(String[] args) 
	{
		System.out.println("");
		A a = new B();
		a.display();
	}
}
