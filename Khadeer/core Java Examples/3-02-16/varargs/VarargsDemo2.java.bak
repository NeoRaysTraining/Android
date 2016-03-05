/* program for imoelementing varargs */

class Hello
{
	void m1(int...a)
	{
		System.out.println("Inside varargs m1()");
		int sum=0;
		for(int x:a)
		{
			sum+=x;
		}
		System.out.println("sum of all numbers is"+sum);
	}
	void m1(int a)
	{
		System.out.println("Inside normal m1");
	}
};

class  VarargsDemo2
{
	public static void main(String[] args) 
	{
		Hello h=new Hello();
		int p=1;
		int q=2;
		int r=3;
		int s=4;
		h.m1(p);
		//h.m1(p,q,r,s);
	}
}
