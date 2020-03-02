class Test
{
	static boolean isPrime(int n)
	{
		if(n == 3)
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

		int count = 1, i;
		for(i = 3; count != 10001; i += 2)
			if(isPrime(i))
				count ++;

		System.out.println(i);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}