class Box
{
	int w,h,d;
	Box(int x,int y, int z)
	{
		w = x;
		h = y;
		d = z;
	}
}

class Test
{
	int p,q;
	Test(int l,int m)
	{
		p = l;
		q = m;
	}
}


class CallByReferenceSameClass
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main()");
		Box b;										// Declaring a Reference variable of type Box
		b = null;									// Initalizing the Reference variable
		System.out.println("value of b is "+b);
		b = new Box(1,2,3);							// Creating an Object of Class Box
		System.out.println("value of w is "+b.w);
		System.out.println("value of h is "+b.h);
		System.out.println("value of d is "+b.d);
		m1(b);									// Passing UDDT as an argument
		System.out.println("inside main()");
		System.out.println("value of w is "+b.w);
		System.out.println("value of h is "+b.h);
		System.out.println("value of d is "+b.d);
		b = m2();								// Passing UDDT as an argument & accepting UDDT as return type
		System.out.println("inside main()");
		System.out.println("value of w is "+b.w);
		System.out.println("value of h is "+b.h);
		System.out.println("value of d is "+b.d);
		Box b1 = b;								// Declaring a Reference variable 'b1' &
												// Initializing Value of 'b' to it,
												// both 'b1' & 'b' refer to same object
		System.out.println("inside main()");
		System.out.println("value of b1 is "+b1);
		System.out.println("value of w is "+b1.w);
		System.out.println("value of h is "+b1.h);
		System.out.println("value of d is "+b1.d);
		Test t = null;								// Declaring & Initializing a Reference variable of type Test
		t = new Test(10,11);						// Creating an Object of Class Test
		System.out.println("inside main()");
		System.out.println("value of t is "+t);
		System.out.println("value of p is "+t.p);
		System.out.println("value of q is "+t.q);
		Test t1 = m3(t);							// Passing UDDT as an argument & accepting UDDT as return type
		System.out.println("inside main()");
		System.out.println("value of t1 is "+t1);
		System.out.println("value of p is "+t1.p);
		System.out.println("value of q is "+t1.q);
		System.out.println("value of p is "+t.p);
		System.out.println("value of q is "+t.q);
		Test t2 = m4();								// Accepting UDDT as return type
		System.out.println("inside main()");
		System.out.println("value of p is "+t2.p);
		System.out.println("value of q is "+t2.q);
		System.out.println("value of p is "+t1.p);
		System.out.println("value of q is "+t1.q);
		System.out.println("value of p is "+t.p);
		System.out.println("value of q is "+t.q);
		System.out.println("End of main()");
	}

	static void m1(Box i)
	{
		System.out.println("inside m1()");
		System.out.println("value of w is "+i.w);
		System.out.println("value of h is "+i.h);
		System.out.println("value of d is "+i.d);
		i.w*=2;
		i.h*=2;									
		i.d*=2;
		System.out.println("value of w is "+i.w);
		System.out.println("value of h is "+i.h);
		System.out.println("value of d is "+i.d);
		System.out.println("End of m1()");
	}

	static Box m2()
	{
		System.out.println("inside m2()");
		int e = 4;
		int f = 5;
		int g = 6;
		Box b1 = new Box(e,f,g);
		System.out.println("value of e is "+e);
		System.out.println("value of f is "+f);
		System.out.println("value of g is "+g);
		System.out.println("End of m2()");
		return b1;
	}

	static Test m3(Test k)
	{
		System.out.println("inside m3()");
		System.out.println("value of w is "+k.p);
		System.out.println("value of h is "+k.q);
		k.p*=2;
		k.q*=2;
		System.out.println("value of w is "+k.p);
		System.out.println("value of h is "+k.q);
		System.out.println("End of m3()");
		return k;
	}

	static Test m4()
	{
		System.out.println("inside m3()");
		int r = 15;
		int s = 25;
		Test t2 = new Test(r,s);
		System.out.println("value of w is "+r);
		System.out.println("value of h is "+s);
		r*=2;
		s*=2;
		System.out.println("value of w is "+r);
		System.out.println("value of h is "+s);
		System.out.println("End of m3()");
		return t2;
	}
}



/*
-:OUTPUT OF ABOVE CODE:-

Begin main()
value of b is null
value of w is 1
value of h is 2
value of d is 3
inside m1()
value of w is 1
value of h is 2
value of d is 3
value of w is 2
value of h is 4
value of d is 6
End of m1()
inside main()
value of w is 2
value of h is 4
value of d is 6
inside m2()
value of e is 4
value of f is 5
value of g is 6
End of m2()
inside main()
value of w is 4
value of h is 5
value of d is 6
inside main()
value of w is 4
value of h is 5
value of d is 6
inside main()
value of p is 10
value of q is 11
inside m3()
value of w is 10
value of h is 11
value of w is 20
value of h is 22
End of m3()
inside main()
value of p is 20
value of q is 22
value of p is 20
value of q is 22
inside m3()
value of w is 15
value of h is 25
value of w is 30
value of h is 50
End of m3()
inside main()
value of p is 15
value of q is 25
value of p is 20
value of q is 22
value of p is 20
value of q is 22
End of main()
*/