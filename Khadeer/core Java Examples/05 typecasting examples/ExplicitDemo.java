/*program for  explicit typecast demo */
class ExplicitDemo 
{
	public static void main(String[] args) 
	{
	/* byte a=0;  //size and range problem
	 int i=130;
	 a=(byte)i;
	 System.out.println(a); */

	 byte a=0;  //type,size and range problem 
	 int i=0;
	 double d=129.598;
	 a=(byte)d;
	 i=(int)d;
	 System.out.println(a);
	 System.out.println(i);
	}
}
  