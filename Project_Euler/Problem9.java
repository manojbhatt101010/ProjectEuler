class Test
{
	static boolean arePythagoreanTriplet(int a, int b, int c)
	{
		return a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a;
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

	Loop:for(int a = 251; a < 1000; a++)
			for(int b = a; b < 1000; b++)
			{
				int c = 1000 - a - b;
				if(arePythagoreanTriplet(a, b, c))
				{
					System.out.println(a * b * c);
					break Loop;
				}
			}

		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}