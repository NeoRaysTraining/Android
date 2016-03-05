/* program to implement encapsulation in finding simple interest */

class Interest
{
	private int p;
	private int t;
	private int r;
	Interest(int x,int y,int z)
	{
		p=x;
		t=y;
		r=z;
	}
	int simpleinterest()
	{
		int i;
		i=(p*t*r)/100;
		return i;
	}
};

class SIDemo 
{
	public static void main(String[] args) 
	{
		Interest i=new Interest(1000,1,15);
		int z=i.simpleinterest();
		System.out.println(z);
	}
}
