import java.math.BigInteger;

class Test
{
	static BigInteger factorial(int n)
	{
		BigInteger fact = BigInteger.ONE;

		for(int i = 2; i <= n; i++)
			fact = fact.multiply(BigInteger.valueOf(i));

		return fact;
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		String s = factorial(100).toString();

		int sumOfDigits = 0;
		for(int i = 0; i < s.length(); i++)
			sumOfDigits += (s.charAt(i) - '0');

		System.out.println(sumOfDigits);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}