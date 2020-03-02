class Test
{
	static int sumOfDivisors(int n)
	{
		if(n == 1 || n == 0)
			return 0;

		int sum = 1, sqrtN = (int)Math.sqrt(n);
		
		for(int i = 2; i < sqrtN; i++)
			if(n % i == 0)
				sum += (i + n/i);

		if(Math.sqrt(n) - sqrtN == 0)
			sum += sqrtN;

		return sum;
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		int totalSum = 0;
		for(int i = 1; i <= 10000; i++)
		{
			int sum1 = sumOfDivisors(i);
			int sum2 = sumOfDivisors(sum1);

			if(sum1 != sum2 && i == sum2)
				totalSum += i;
		}

		System.out.println(totalSum);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}