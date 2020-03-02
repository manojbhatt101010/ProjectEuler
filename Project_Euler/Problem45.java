class Test
{
	static boolean isTriangleNumber(long x)
	{
		return (Math.sqrt(1 + 8*x) - 1) % 2 == 0;
	}

	static boolean isPentagonalNumber(long x)
	{
		return (1 + Math.sqrt(1 + 24 * x)) % 6 == 0;
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		for(int n = 144; ; n++)
		{
			long Hn = n*(2*n - 1);

			if(isTriangleNumber(Hn) && isPentagonalNumber(Hn))
			{
				System.out.println(Hn);
				break;
			}
		}

		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}