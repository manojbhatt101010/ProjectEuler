class Test
{
	static boolean isPrime(int n)
	{
		if(n < 2)
			return false;

		if(n == 2 || n == 3)
			return true;

		if(n % 2 == 0 || n % 3 == 0)
			return false;

		for(int i = 5; i*i <= n; i += 6)
			if(n % i == 0 || n % (i + 2) == 0)
				return false;

		return true;
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		int maxPrimes = 0, A = 0, B = 0;
		for(int a = -999; a < 1000; a++)
			for(int b = -1000; b <= 1000; b++)
			{
				int n;
				for(n = 0; ; n++)
					if(!isPrime(n * n + a * n + b))
						break;

				if(n > maxPrimes)
				{
					maxPrimes = n;
					A = a;
					B = b;
				}
			}

		System.out.println(A * B);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}










