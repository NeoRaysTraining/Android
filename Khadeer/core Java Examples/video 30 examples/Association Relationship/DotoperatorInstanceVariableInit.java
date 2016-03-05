/* program to intialize intance variable in a class using dot operator */

class Hello
{
	int x;
	int y;
	Test t;
	void fun()
	{
		System.out.println("value of x is"+x);
		System.out.println("value of y is"+y);
		System.out.println("value of p in t is"+t.p);
		t.m1();
	}
}

class Test
{
	int p;
	Test(int p)
	{
		this.p=p;
	}
	void m1()
	{
		System.out.println("value of p is "+p);
	}
}

class DotoperatorInstanceVariableInit 
{
	public static void main(String[] args) 
	{
		Hello h=null;
		h=new Hello();
		System.out.println(h.x);
		System.out.println(h.y);
		//System.out.println(h.t); //raises null pointer exception error
		//System.out.println(h.t.p);// raises null pointer exception
		//h.t.m1(); //raises null pointer exception
		h.x=10;
		h.y=20;
		h.t=new Test(5);
		//Test z=new Test(5); //alternate to the above line object creation 
		//h.t=z;
		h.t.m1();
		h.fun();
	}
}
		
	
