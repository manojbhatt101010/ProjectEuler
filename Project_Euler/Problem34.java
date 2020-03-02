class Test
{
	static int factorial(int n)
	{
		int fact = 1;
		for(int i = 2; i <= n; i++)
			fact *= i;

		return fact;
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		int totalSum = 0;
		for(int n = 10; n < 2000000; n++)
		{
			int sum = 0;
			for(int i = n; i != 0; i /= 10)
				sum += factorial(i % 10);

			if(sum == n)
				totalSum += n;
		}

		System.out.println(totalSum);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}

