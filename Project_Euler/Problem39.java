class Test
{
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		int[] count = new int[1001];

		for(int a = 1; a < 1000; a++)
			for(int b = 1; b < 1000; b++)
			{
				double c = Math.sqrt(a * a + b * b);

				int p = (int)(a + b + c);
				if(c - (int)c == 0 && p <= 1000)
					count[p]++;
			}

		int max = 0, p = 0;
		for(int i = 0; i < 1001; i++)
			if(count[i] > max)
			{
				p = i;
				max = count[i];
			}

		System.out.println(p);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");

	}
}

