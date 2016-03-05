/* program to implement how m2() can access m1() which is present in same class*/

class Box
{
	int w,h,d;
	Box(int x,int y,int z)
	{
		w=x;
		h=y;
		d=z;
	}
	int volume()
	{
		int l;
		l=w*h*d;
		return l;
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

class  ConstructorMethodDemo
{
	public static void main(String[] args) 
	{
		Box b1;
		b1=new Box(1,2,3);
		System.out.println(b1.w);
		System.out.println(b1.h);
		System.out.println(b1.d);
		//b1.m1(); /as its declared as static cannot be accessed outside the class
		b1.m2();
	}
}

	
