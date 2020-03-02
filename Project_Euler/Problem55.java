import java.math.BigInteger;

class Test
{
	static boolean isPalindrome(String s)
	{
		return s.equals(new StringBuilder(s).reverse().toString());
	}

	static BigInteger reverse(BigInteger n)
	{
		return new BigInteger(new StringBuilder(n.toString()).reverse().toString());
	}

	static boolean isLychrel(BigInteger n)
	{
		for(int i = 0; i < 50; i++)
		{
			n = n.add(reverse(n));

			if(isPalindrome(n.toString()))
				return false;
		}

		return true;
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		int count = 0;
		for(int n = 1; n < 10000; n++)
			if(isLychrel(BigInteger.valueOf(n)))
				count++;

		System.out.println(count);

		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}