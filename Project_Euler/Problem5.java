class Test
{
	static boolean dividedByAll(int n)
	{
		for(int i = 3; i < 20; i++)
			if(n % i != 0)
				return false;

		return true;
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		for(int n = 2000; ; n += 20)
			if(dividedByAll(n))
			{
				System.out.println(n);
				break;
			}

		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}