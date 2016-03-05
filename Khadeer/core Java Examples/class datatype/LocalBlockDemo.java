/* program to implement local block demo */

class LocalBlockDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Inside Main");
		int a=1;
		System.out.println("value of a is"+a);
		{
			int b=2;
			System.out.println("Inside first block");
			System.out.println("value of a is"+a);
			System.out.println("value of b is"+b);
			{
				int c=3;
				{
					System.out.println("Inside second block");
					System.out.println("value of a is"+a);
					System.out.println("value of b is"+b);
					System.out.println("value of c is"+c);
				}
			}
		}
	}
}
