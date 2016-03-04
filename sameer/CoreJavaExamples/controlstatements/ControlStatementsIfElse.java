class ControlStatementsIfElse 
{
	public static void main(String[] args) 
	{
		int j = 5;
		boolean b = true;
		
		if (j==5)
		{
			System.out.println("inside if block");
			System.out.println("j is equal to 5");
		}

		if (j<6)
		{
			System.out.println("inside IF block");
			System.out.println("j is lesser than 6");

		}
		else
		{
			System.out.println("inside ELSE block");
			System.out.println("j is greater than 6");
		}

/*		if (j>6)
		{
			System.out.println("inside IF block");
			System.out.println("j is greater than 6");
		}
		else
		{
			System.out.println("inside ELSE block");
			System.out.println("j is lesser than 6");
		}
*/
		if (b)
		{
			System.out.println("inside IF block");
			System.out.println("value of b is True");
		}
		else
		{
			System.out.println("inside ELSE block");
			System.out.println("value of b is False");
		}

/*		if (!b)
		{
			System.out.println("inside IF block");
			System.out.println("value of b is False");
		}
		else
		{
			System.out.println("inside ELSE block");
			System.out.println("value of b is True");
		}
*/
	}
}
