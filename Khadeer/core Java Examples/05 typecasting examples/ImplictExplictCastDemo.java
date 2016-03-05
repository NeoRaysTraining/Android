class ImplictExplictCastDemo 
{
	public static void main(String[] args) 
	{
		byte x=5;
		int y=0;

		/* y=x; //implict casting
		System.out.println(x);
		System.out.println(y);*/

		//x=y;
		 x=(byte)y;   //explicit casting
		System.out.println(x);
		System.out.println(y);

	}
}
