class Test
{
	static int countSteps(long n)
	{
		int steps = 1;

		while(n != 1)
		{
			if(n % 2 == 0)
				n /= 2;
			else
				n = 3*n + 1;

			steps++;
		}
		return steps;
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		int maxSteps = 1;
		for(int i = 1; i <= 1000000; i++)
		{
			int steps = countSteps(i);
			if(steps > maxSteps)
				maxSteps = steps;
		}

		System.out.println(maxSteps);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}