/*program to debug the value of i in the program */

class  DebugDemo
{
	public static void main(String[] args) 
	{
		int i=0;
		System.out.println(i);
		i=5;
		System.out.println(i);
		i=i; //the value of i remains same i.e..5
		System.out.println(i);
	}
}