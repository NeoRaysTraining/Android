/* program to implement varargs */

class Hello
{
	void m1(int...a)
	{
		for(int x:a)
		{
			System.out.println("value of x is"+x);
		}
	}
};

class VarargsDemo
{
	public static void main(String[] args) 
	{
			Hello h=new Hello();
			/*int p=1;
			int q=2;
			int r=3;
			int s=4;
			h.m1();
			h.m1(p,q);
			h.m1(p,q,r);
			h.m1(p,q,r,s); */

			byte a=1;
			byte b=2;
			byte c=3;
			byte d=4;
			h.m1();
			h.m1(a,b);
			h.m1(a,b,c);
			h.m1(a,b,c,d);

	}
}
