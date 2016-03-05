/* program to implement an array as instance variable */

class Hello
{
	int i=5;
	int x[]={100,101,102,103,104};
}

class ArrayAsInstanceVariable 
{
	public static void main(String[] args) 
	{
		Hello h=null;
		h=new Hello();
		System.out.println(h.x);
		System.out.println(h.x[0]);
		System.out.println(h.x[1]);
		System.out.println(h.x[2]);
		System.out.println(h.x[3]);
		System.out.println(h.x[4]);
	}
}
