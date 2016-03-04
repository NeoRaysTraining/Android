class PrimitiveDataTypes 
{
	public static void main(String[] args) 
	{

//		BYTE DATATYPE

		byte b = 0;
		System.out.println("value  'b' is "+b);
		b = 127;								//Range of byte data type is betwn -(2^(8-1)) & +(2^(8-1)-1)
		System.out.println("value  'b' is "+b);
		b = -128;
		System.out.println("value  'b' is "+b);

/*		b = 128;								//Error: out of byte datatype range
		System.out.println("value  'b' is "+b);
		b = -129;								//Error: out of byte datatype range		
		System.out.println("value  'b' is "+b);
		b = "B";								//Error: incompatible type
		System.out.println("value  'b' is "+b);
		b = true;								//Error: incompatible type
		System.out.println("value  'b' is "+b);
		b = 5.6;								//Error: incompatible type
		System.out.println("value  'b' is "+b);
		b = 5.6f;								//Error: incompatible type
		System.out.println("value  'b' is "+b);
*/
		b = 'A';								//Converts char to ASCII value & stores
		System.out.println("value  'b' is "+b);

//		SHORT DATATYPE

		short s = 0;
		System.out.println("value  's' is "+s);
		s = 32767;								//Range of short data type is betwn -(2^(16-1)) & +(2^(16-1)-1)
		System.out.println("value  's' is "+s);
		s = -32768;
		System.out.println("value  's' is "+s);
/*		s = 32768;								//Error: out of short datatype range
		System.out.println("value  's' is "+s);
		s = -32769;								//Error: out of short datatype range
		System.out.println("value  's' is "+s);
		s = "B";								//Error: incompatible type
		System.out.println("value  's' is "+s);
		s = true;								//Error: incompatible type
		System.out.println("value  's' is "+s);
		s = 5.6;								//Error: incompatible type
		System.out.println("value  's' is "+s);
		s = 5.6f;								//Error: incompatible type
		System.out.println("value  's' is "+s);
*/
		s = 'A';								//Converts char to ASCII value & stores
		System.out.println("value  's' is "+s);


//		INT DATATYPE

		int i = 0;
		System.out.println("value  'i' is "+i);
		i = 12345;								//Range of int data type is betwn -(2^(32-1)) & +(2^(32-1)-1)
		System.out.println("value  'i' is "+i);
		i = -67890;
		System.out.println("value  'i' is "+i);
/*		i = "B";								//Error: incompatible type
		System.out.println("value  'i' is "+i);
		i = true;								//Error: incompatible type
		System.out.println("value  'i' is "+i);
		i = 5.6;								//Error: incompatible type
		System.out.println("value  'i' is "+i);
		i = 5.6f;								//Error: incompatible type
		System.out.println("value  'i' is "+i);
*/		i = 'A';								//Converts char to ASCII value & stores
		System.out.println("value  'i' is "+i);

//		FLOAT DATATYPE

		float f = 0;
		System.out.println("value  'f' is "+f);
		f = 25.6f;								//Range of float data type is betwn (3.4e-38) & (3.4e38)
		System.out.println("value  'f' is "+f);
		f = -46.7f;
		System.out.println("value  'f' is "+f);
		f = 123;								
		System.out.println("value  'f' is "+f);
//		f = "B";								//Error: incompatible type
		System.out.println("value  'f' is "+f);
//		f = true;								//Error: incompatible type
		System.out.println("value  'f' is "+f);
//		f = 5.6;								//Error: incompatible type
		System.out.println("value  'f' is "+f);
		f = 'A';								//Converts char to ASCII value & stores
		System.out.println("value  'f' is "+f);
	}
}
