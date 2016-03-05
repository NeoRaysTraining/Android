/* program to write subclass constructors and overload subclass constructor */

class Box
{
	int w,h,d;
	Box(int w,int h,int d)
	{
		this.w=w;
		this.h=h;
		this.d=d;
	}
	Box (int w,int h,int d)
	{
		this.w=w;
		this.h=h;
		d=10;
	}
	Box(int x)
	{
		w=h=d=x;
	}
	int volume()
	{
		c=w*h*d;
		System.out.println(c);
	}
	void m1()
	{
		System.out.println("value of w,h,d are"+w+"\t"+h+"\t"+d);
	}
}

class BoxWeight extends Box
{
	int m;
	BoxWeight(int w,int h,int d,int m)
	{
		super(w,h,d);
		this.m=m;
	}
	BoxWeight(int w,int h,int d,int m) //overloaded constructor
	{
		System.out.println(w,h);
		this.m=m;
	}
	BoxWeight(int x,int m)
	{
		super(x);
		this.m=m;
	}
	void m2()
	{
		System.out.println("Inside m2()");
		super.m1();
	}
}

class OverloadSubClassConstructorDemo 
{
	public static void main(String[] args) 
	{
		Box b=new Box(1,2,3);
		BoxWeight bw= new BoxWeight(5,6,7,8);

	}
}
