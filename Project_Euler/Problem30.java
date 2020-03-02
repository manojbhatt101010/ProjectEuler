class Test
{
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		int sum = 0;
		for(int n = 2; n < 240000; n++)
		{
			String s = n + "";

			int sumOfFifthPowerOfDigits = 0;
			for(int i = 0; i < s.length(); i++)
				sumOfFifthPowerOfDigits += Math.pow(s.charAt(i) - '0', 5);

			if(sumOfFifthPowerOfDigits == n)
				sum += n;
		}

		System.out.println(sum);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}

