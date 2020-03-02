class Test
{
	static int countDivisors(int n)
	{
		int count = 0, sqrtN = (int)Math.sqrt(n);
		for(int i = 1; i < sqrtN; i++)
			if(n % i == 0)
				count += 2;

		if(Math.sqrt(n) - sqrtN == 0)
			count++;

		return count;
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		int currentTerm = 0;
		for(int i = 1; ; i++)
		{
			currentTerm += i;
			int noOfDivisors = countDivisors(currentTerm);

			if(noOfDivisors > 500)
			{
				System.out.println(currentTerm);
				break;
			}
		}

		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}