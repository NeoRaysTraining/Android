class Typecast 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		byte b=5;
		int i=0;
		System.out.println("value of b"+b);
		System.out.println("value of i"+i);
		i=b;
		
		//implicit or widening conversion
       b=0;
		 i=5;
	System.out.println("value of b"+b);
	System.out.println("value of i"+i);
	
	//b=i;
	b=(byte)i;
	int a=10;
	float f=0.123f;
	System.out.println("value of f"+f);


	}
}
