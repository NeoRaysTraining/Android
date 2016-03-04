class  LifeScopePrimVariable
{
	public static void main(String[] args) 
	{
		System.out.println("Begin Main");
		int a = 1;											
		System.out.println("Value of 'a' before is "+ a);
		int x = m1(a);										// Calling m1,passing 1 argument & accepting return type
															// 'a' is alive & in scope
		System.out.println("Value of 'a' after is "+ a);
		System.out.println("End of Main");
	}

//	static void m1(int p)
	static int m1(int p)
	{
		System.out.println("");
		System.out.println("Begin m1()");
		int b = 2;											
		System.out.println("Value of 'p' before is "+ p);
		System.out.println("Value of 'b' before is "+ b);
		int y = m2(b,p);									// Calling m1,passing 2 arguments & accepting return type
															// 'b' & 'p' are alive & in scope
		System.out.println("Value of 'p' after is "+ p);
		System.out.println("Value of 'b' after is "+ b);
		System.out.println("End of m1()");
		System.out.println("");
		return b;
	}
//	static void m2(int q, int r)
	static int m2(int q, int r)
	{
		System.out.println("");
		System.out.println("Begin m2()");
		int c = 3;										
		System.out.println("Value of 'c' before is "+ c);
		System.out.println("Value of 'q' before is "+ q);
		System.out.println("Value of 'r' before is "+ r);
		int z = m3(c,q,r);									// Calling m1,passing 3 arguments & accepting return type
															// 'c','q' & 'r' are alive & in scope
		System.out.println("Value of 'c' after is "+ c);
		System.out.println("Value of 'q' after is "+ q);
		System.out.println("Value of 'r' after is "+ r);
		System.out.println("End of m2()");
		System.out.println("");
		return c;
	}

//	static void m3(int s, int t, int u)
	static int m3(int s, int t, int u)
	{
		System.out.println("");
		System.out.println("Begin m3()");
		int d = 4;											// 'd','s','t' & 'u' are alive & in scope
		System.out.println("Value of 'd' before is "+ d);
		System.out.println("Value of 's' before is "+ s);
		System.out.println("Value of 't' before is "+ t);
		System.out.println("Value of 'u' before is "+ u);
		System.out.println("End of m3()");
		System.out.println("");
		return d;
	}
}
