/* program to implement autopromotion */
class Hello
{
	void m1(int a)
	{
		System.out.println("inside m1 method");
		System.out.println("value of a is"+a);
	}
};
class AutopromotionDemo 
{
	public static void main(String[] args) 
	{
		Hello h; //creating a referencevariable
		h = new Hello();
		int x=5;
		h.m1(x);
		byte y=6;
		h.m1(y);
		short z=8;
		h.m1(z);
		/*long l=12;  //as the size of int is less than long and double so it cannot be assigned to int
		h.m1(l);
		double p=8.2;
		h.m1(p);*/

	}
}