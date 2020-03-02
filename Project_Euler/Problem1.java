class Test
{
	static int sumOfSeriesOf(int n)
	{
		int noOfTerms = 999/n;

		return (noOfTerms * (n + n * noOfTerms)) / 2;
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		System.out.println(sumOfSeriesOf(3) + sumOfSeriesOf(5) - sumOfSeriesOf(15));
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}