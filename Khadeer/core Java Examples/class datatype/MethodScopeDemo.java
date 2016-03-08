/*program to implement method scope demo */

class  MethodScopeDemo
{
	public static void main(String[] args) 
	{
		System.out.println("begin main");
		int a=1;
		m1(a);
	}
	static void m1(int p)
	{
		int x=10;
		System.out.println(x);
		m2(p,x);
		System.out.println(p);
		System.out.println(x);
	}
	static void m2(int l,int m)
	{
		int y=20;
		System.out.println(l);
		System.out.println(m);
		System.out.println(y);
		m3(l,m,y);
		System.out.println(l);
		System.out.println(m);
		System.out.println(y);
	}
	static void m3(int i,int j,int k)
	{
		int z=30;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(z);
}
}