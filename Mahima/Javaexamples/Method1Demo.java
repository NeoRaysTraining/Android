class Method1Demo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		m1();
		m2();	
	}
	static void m1()
		{
	System.out.println("begin m1()");
	System.out.println("inside m1()");
	m2();
		}
	static void m2()
		{
	System.out.println("begin m2()");
	System.out.println("inside m2()");
		
		}
}
