/* program to implement the use of private keyword */

class Test
{
	private int x;
	Test(int p)
	{
		x=p;
	}
	private void m1()
	{
		System.out.println("Inside m1");
	}
	void m2()
	{
		m1();
		System.out.println("Inside m2");
	}
};  
class PrivateDemo
{
	public static void main(String[] args) 
	{
		Test t1;
		t1=new Test(5);
	//	t1.m1(); // m1 is declared as private so it cannot be accessed outside the class
		t1.m2();
	}
}
