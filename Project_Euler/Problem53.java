import java.math.BigInteger;

class Test
{
	static BigInteger nCr(int n, int r)
	{
		int x = Math.max(r, (n - r));
		BigInteger num = BigInteger.ONE, denom = BigInteger.ONE;

		for(int i = 0; i < n-x; i++)
		{
			num = num.multiply(BigInteger.valueOf(n - i));
			denom = denom.multiply(BigInteger.valueOf(n - x - i));
		}

		return num.divide(denom);
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		int count = 0;
		BigInteger million = BigInteger.valueOf(1000000);

		for(int n = 23; n <= 100; n++)
		{
			int r;
			for(r = 0; r <= n/2; r++)
				if(nCr(n, r).compareTo(million) == 1)
					break;

			if(n % 2 == 0)
				count += ((n/2 - r) * 2 + 1);

			else
				count += ((n/2 - r) * 2 + 2);
		}

		System.out.println(count);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}