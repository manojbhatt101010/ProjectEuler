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

		int sum = 0;
		for(int i = 1; i < 1000000; i++)
			if(isPalindrome(i + "") && isPalindrome(Integer.toString(i, 2)))
				sum += i;

		System.out.println(sum);
		System.out.println(System.currentTimeMillis() - startTime + " ms");
	}
}

