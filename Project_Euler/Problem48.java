import java.math.BigInteger;

class Test
{
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		BigInteger sumOfSeries = BigInteger.ZERO;

		for(int n = 1; n <= 1000; n++)
			sumOfSeries = sumOfSeries.add(BigInteger.valueOf(n).pow(n));

		String s = sumOfSeries.toString();

		System.out.println(s.substring(s.length() - 10, s.length()));
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}