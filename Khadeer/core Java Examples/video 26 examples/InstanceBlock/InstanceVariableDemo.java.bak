/* program to use this keyword with instance variable */
class Box
{
	int w;
	int h;
	int d;
	Box(int x,int y,int z)
	{
		System.out.println(this.w);
		System.out.println(this.h);
		System.out.println(this.d);
		this.w=x;
		this.h=y;
		this.d=z;
		System.out.println(w);
		System.out.println(h);
		System.out.println(d);
	}
	int volume()
	{
		int l;
		l=w*h*d;
		return l;
	}

}
class InstanceVariableDemo
{
	public static void main(String[] args) 
	{
		Box b1 ;
		b1=new Box(1,2,3);
		System.out.println(b1.w);
		System.out.println(b1.h);
		System.out.println(b1.d);
		int x=b1.volume();
		System.out.println("volume of Box is"+x);
	}
}
