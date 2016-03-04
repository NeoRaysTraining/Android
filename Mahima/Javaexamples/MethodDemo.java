class MethodDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int i=1;
		int j=2;
		int a=m1(i,j);

		
	}
static	int m1(int x,int y)
		{
		System.out.println(x);
		System.out.println(y);
			x=x*3;
			y=y*4;
			System.out.println(x);
		System.out.println(y);
		return x;
          
		}
}
