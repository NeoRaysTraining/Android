class InstanceOfOperator
{
	{
	System.out.println("Inside Demo class");
	}
}
class Demo
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		InstanceOfOperator i = new InstanceOfOperator();		// creating object of class InstanceOfOperator
		System.out.println(i instanceof InstanceOfOperator);	// Prints true 
																// bcoz i is an Instance of type 
																// InstanceOfOperator class
	}
}
