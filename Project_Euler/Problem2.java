class Test
{
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		int a = 1, b = 2, sum = 2;
		while(a + b <= 4000000)
		{
			int c = a + b;
			if(c % 2 == 0)
				sum += c;

			a = b;
			b = c;
		}

		System.out.println(sum);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}