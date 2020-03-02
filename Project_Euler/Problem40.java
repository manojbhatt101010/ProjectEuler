class Test
{
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		int add = 1, neededIndex = 1, length = 0, result = 1;
		for(int n = 1, m = 10; neededIndex <= 1000000; n++)
		{
			if(n < m)
				length += add;
			else
			{
				m *= 10;
				length += ++add;
			}

			if(length >= neededIndex)
			{
				int tempLength = length;
				for(int i = n; ; i /= 10)
					if(tempLength-- == neededIndex)
					{
						result *= i % 10;
						break;
					}

				neededIndex *= 10;
			}
		}

		System.out.println(result);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");

	}
}

