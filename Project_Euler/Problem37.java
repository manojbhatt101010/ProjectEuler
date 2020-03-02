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

	static boolean isTruncatablePrime(int n)
	{
		for(int i = 10; i < n; i *= 10)
			if(!isPrime(n % i) || !isPrime((n - n % i) / i))
				return false;

		return true;
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		int count = 0, sum = 0;
		for(int n = 11; count != 11; n += 2)
			if(isPrime(n) && isTruncatablePrime(n))
			{
				sum += n;
				count++;
			}

		System.out.println(sum);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");

	}
}

