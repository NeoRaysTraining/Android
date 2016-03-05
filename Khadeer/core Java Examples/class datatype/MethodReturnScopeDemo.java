/*proram for returning values in method scope */

class  MethodReturnScopeDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Begin Main");
		int a=1;
		int result=m1(a);
		System.out.println(result);
	}
	static int m1(int p)
	{
		int x=0;
		System.out.print(p);
		System.out.print(x);
		int b=m2(p,x);
		System.out.print(p);
		System.out.print(x);
		return b;
	}
	static int m2(int l, int m)
	{
		int y=20;
		System.out.print(l);
		System.out.print(m);
		System.out.print(y);
		int c=m3(l,m,y);
		System.out.print(l);
		System.out.print(m);
		System.out.print(y);
		System.out.print(c);
		return c;
	}
	static int m3(int i,int j,int k)
	{
		int z=30;
		System.out.print(i);
		System.out.print(j);
		System.out.print(k);
		System.out.print(z);
		int arr[]={i,j,k,z}; //returning multiple values
		//return arr;
		return z;
	}
}
}