class StringReverse
{
	public static void main(String args[])

	{

		String s1 ="sameer";

		for (int i=0;i<=s1.length()-1;i++)

		{

			System.out.print(s1.charAt(i));			// Prints the given string as it is

		}

		{

			System.out.println();

		}

		for (int j=s1.length()-1;j>=0;--j)

		{

			System.out.print(s1.charAt(j));			// Prints the given string in reverse order

		}
		{

			System.out.println();

		}
	}
 
	}