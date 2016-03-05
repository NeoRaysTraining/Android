/* program to implement array as instance variable and intialize with method */

class Hello
{
	int i;
	int x[];
	void m1(int i,int x[])
	{
		this.i=i;
		this.x=x;
		System.out.println(x[0]);
				System.out.println(x[1]);
						System.out.println(x[2]);
								System.out.println(x[3]);
	}
}
class  InstanceArrayInitByMethod
{
	public static void main(String[] args) 
	{
		int a=5;
		Hello h=null;
		h=new Hello();
		int p[]={100,101,102,103,104};
		h.m1(a,p);
		
	}
}
