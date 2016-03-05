/* program to implement oops in class and perform arithmetic operation */

class Arithmetic
{
	private int p;
	private int q;
	Arithmetic(int x,int y)
	{
		p=x;
		q=y;
	}
	int add()
	{
		int r;
		r=p+q;
		return r;
	}
	int multiply()
	{
		int r;
		r=p*q;
		return r;
	}
	int subtract()
	{
		int r;
		r=p-q;
		return r;
	}
	int division()
	{
		int r;
		r=p/q;
		return r;
	}

};


class ArithmeticDemo 
{
	public static void main(String[] args) 
	{
		int x=10;
		int y=2;
	 Arithmetic a = new  Arithmetic(x,y);
	 int z=a.add();
	 System.out.println(z);
	 int p=a.subtract();
	 System.out.println(p);
	 int q=a.multiply();
	 System.out.println(q);
	 int r=a.division();
	 System.out.println(r);
	}
}
