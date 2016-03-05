/* program to implement an array as instance variable and intialize it by dot operator */


class Hello
{
	int i;  //primitive variable
	int x[]; //Array variable
}
class  InstanceVariableInitbyDotOperator
{
	public static void main(String[] args) 
	{
		Hello h=null;
		h=new Hello();
		System.out.println(h.i);
		System.out.println(h.x);
		//System.out.println(h.x[0]); //gives null pointer exception
		h.i=5;
		int p[]={100,101,102,103,104};
		h.x=p;

		System.out.println(h.i);
		System.out.println(h.x);
		System.out.println(h.x[0]);
		System.out.println(h.x[1]);
		System.out.println(h.x[2]);
		System.out.println(h.x[3]);
		System.out.println(h.x[4]);
	}
}
