class Test
{
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		long p1, p2, p3, p4, sum;
		p1 = p2 = p3 = p4 = sum = 1;

		for(int i = 0; i < 500; i++)
		{
			p1 = p1 + 6 * (i + 1) + i * 2;
			p2 = (long)Math.pow(Math.sqrt(p2) + 2, 2);
			p3 = p3 + 2 * (4 * i + 1);
			p4 = p4 + 4 * (2 * i + 1);

			sum += (p1 + p2 + p3 + p4);
		}

		System.out.println(sum);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}










