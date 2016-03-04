class  ReverseDemo
{
		static void stringreverse(String s)
		{
			char  ch[]=new char[s.length()];
			for(int i=s.length()-1;i>=0;--i)
			System.out.println(s.charAt(i));
			}
		public static void main(String[] args)
			{
			ReverseDemo.stringreverse("Mahima");
	}
}
                                                    