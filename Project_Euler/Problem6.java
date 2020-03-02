class Test
{
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		long sumOfSq = (n*(n + 1)*(2*n + 1))/6;
		long squareOfS = (long)Math.pow((n*(n + 1))/2, 2);

		System.out.println(squareOfS - sumOfSq);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}