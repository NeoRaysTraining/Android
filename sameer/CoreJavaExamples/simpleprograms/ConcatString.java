class ConcatString
{
	public static void main(String[] args) 
	{
		System.out.println("Begin Main");

		String s1 = "Neo";							// Declare & Initialize String s1

		String s2 = "Rays";							// Declare & Initialize String s2

		System.out.println("value of s1 is "+ s1);	// Prints Neo

		System.out.println("value of s2 is "+ s2);	// Prints Rays

		String s3 = s1 + s2;						// Overloaded + operator betwn 2 strings performs Concatination

		System.out.println("value of s3 is "+ s3);	// Prints NeoRays

//		s1 = s1+ s2;								
//		System.out.println("value of s1 is "+ s1);

		System.out.println("End of Main");
	}
}
