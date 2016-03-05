/*program to implement the use of private keyword */

class Box
{
	private int w;
	private int h;
	private int d;
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
	void show()
	{
		System.out.println("value of w, h , d are"+w+"\t"+h+"\t"+d);
	}
};

class PrivateDemo1 
{
	public static void main(String[] args) 
	{
	  int i=1;
	  int j=2;
	  int k=3;
	  int p;
	  Box b;
	  b=new Box(1,2,3);
	  p=b.volume();
	  System.out.println("volume of box b is"+p);
	  b.show();
	}
}
