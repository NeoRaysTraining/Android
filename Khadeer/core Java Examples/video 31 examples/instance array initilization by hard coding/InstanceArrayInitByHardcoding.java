/* program to implement an array as instance variable and intialize it by hardcoding */
class Hello
{
	int i=5;
	int x[]=new int[5];// declearing and creating an array
	{
		x[0]=100; // intialaizing an array
		x[1]=101;
		x[2]=102;
		x[3]=103;
		x[4]=104;
	}
}

class  InstanceArrayInitByHardcoding
{
	public static void main(String[] args) 
	{
		Hello h=null;
		h=new Hello();
		System.out.println(h.x);
		System.out.println(h.x[0]);
		System.out.println(h.x[1]);
		System.out.println(h.x[2]);
		System.out.println(h.x[3]);
		System.out.println(h.x[4]);

	}
}
