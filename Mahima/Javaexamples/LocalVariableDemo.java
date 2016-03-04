class LocalVariableDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	int a=1;
		System.out.println("value of a  " +a);
		{
	int b=5;
		System.out.println("value of a " +a);
		System.out.println("value of b " +b);
         
			{
		int c=3;
		System.out.println("value of a " +a);
		System.out.println("value of b " +b);
		System.out.println("value of c " +c);
			}
//	System.out.println("value of c " +c); //cannot access outside the block c
		}
	//System.out.println("value of b " +b);cannot access outside the block b
	}
//System.out.println("value of a  " +a);cannot access outside the block a
}
