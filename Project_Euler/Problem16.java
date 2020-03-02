import java.math.BigInteger;

class Test
{
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		BigInteger n = BigInteger.ONE;
		for(int i = 0; i < 1000; i++)
			n = n.multiply(BigInteger.valueOf(2));

		String s = n.toString();

		int sumOfDigits = 0;
		for(int i = 0; i < s.length(); i++)
			sumOfDigits += (s.charAt(i) - '0');

		System.out.println(sumOfDigits);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}