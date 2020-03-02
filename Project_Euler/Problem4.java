class Test
{
	static boolean isPalindrome(String s)
	{
		for(int i = 0; i < s.length()/2; i++)
			if(s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;

		return true;
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		int largestPalindrome = 0;
		for(int i = 315; i < 1000; i++)
			for(int j = 315; j < 1000; j++)
			{
				int product = i * j;
				if(isPalindrome(Integer.toString(product)) && product > largestPalindrome)
					largestPalindrome = product;
			}

		System.out.println(largestPalindrome);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}