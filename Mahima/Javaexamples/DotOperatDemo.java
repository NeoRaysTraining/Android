
class Box
{
	int w;
	int h;
	int d;

};
class DotOperatDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Box b;
	    b=new Box();
		System.out.println("" +b);

       System.out.println(b.w);
	   System.out.println(b.h);
	   System.out.println(b.d);
	   b.w=6;
	   b.h=6;
	   b.d=7;
	   System.out.println(b.w);
	   System.out.println(b.h);
	   System.out.println(b.d);
	   Box b1;
	    b1=new Box();
		System.out.println("" +b1);
		b.w=667;
	   b.h=643;
	   b.d=777;
	   System.out.println(b.w);
	   System.out.println(b.h);
	   System.out.println(b.d);



		
	}
}
