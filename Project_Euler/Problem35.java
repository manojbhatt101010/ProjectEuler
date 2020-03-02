class Test
{
	static boolean isPrime(int n)
	{
		if(n == 2 || n == 3)
			return true;

		if(n % 2 == 0 || n % 3 == 0)
			return false;

		for(int i = 5; i*i <= n; i += 6)
			if(n % i == 0 || n % (i + 2) == 0)
				return false;

		return true;
	}

	static boolean areAllRotationsPrime(String s)
	{
		char[] c = s.toCharArray();

		for(int i = 0; i < c.length - 1; i++)
		{
			char first = c[0];
			for(int j = 0; j < c.length - 1; j++)
				c[j] = c[j+1];

			c[c.length - 1] = first;

			if(!isPrime(Integer.parseInt(new String(c))))
				return false;
		}
		return true;
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		int count = 1;
		for(int n = 3; n < 1000000; n += 2)
			if(isPrime(n) && areAllRotationsPrime(n + ""))
				count++;

		System.out.println(count);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}

