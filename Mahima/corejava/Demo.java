class Add
{
 void m1(int a)
	{
	System.out.println(a);
	}
  void m1(int a,int b)
	{
  System.out.println(a);
   System.out.println(b);
	}
	void m1(int a,int b,double d)
	{
   System.out.println(b);
   System.out.println(a);
   System.out.println(d);
	}

};
class OverLoading
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Add a=new Add();
		a.m1(5);

		a.m1(6,7);

	a.m1(61,71,9.2);

	}
}
