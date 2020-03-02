class Test
{
	static boolean isPrime(int n)
	{
		if(n == 2 || n == 3)
			return true;

		if(n < 2 || n % 2 == 0 || n % 3 == 0)
			return false;

		for(int i = 5; i*i <= n; i += 6)
			if(n % i == 0 || n % (i + 2) == 0)
				return false;

		return true;
	}

	static boolean isRight(int n)
	{
		for(int i = 1; 2*i*i < n; i++)
			if(isPrime(n - 2*i*i))
				return true;

		return false;
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		for(int n = 35; ; n += 2)
			if(!isPrime(n) && !isRight(n))
			{
				System.out.println(n);
				break;
			}

		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}