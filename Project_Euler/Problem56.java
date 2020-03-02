import java.math.BigInteger;

class Test
{
	static int findSumOfDigits(int a, int b)
	{
		String s = BigInteger.valueOf(a).pow(b).toString();

		int sum = 0;
		for(int i = 0; i < s.length(); i++)
			sum += s.charAt(i) - '0';

		return sum;
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		int maxSum = 0;
		for(int a = 50; a < 100; a++)
			for(int b = 50; b < 100; b++)
			{
				int sumOfDigits = findSumOfDigits(a, b);

				if(sumOfDigits > maxSum)
					maxSum = sumOfDigits;
			}

		System.out.println(maxSum);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}