class Test
{
	static boolean isPrime(int n)
	{
		if(n % 2 == 0 || n % 3 == 0)
			return false;

		for(int i = 5; i*i <= n; i += 6)
			if(n % i == 0 || n % (i + 2) == 0)
				return false;

		return true;
	}

	static String swap(String s, int a, int b)
	{
		char[] data = s.toCharArray();

		char temp = data[a];
		data[a] = data[b];
		data[b] = temp;

		return new String(data);
	}

	static String reverse(String s, int a, int b)
	{
		char[] data = s.toCharArray();

		while(a < b)
		{
			char temp = data[a];
			data[a++] = data[b];
			data[b--] = temp;
		}

		return new String(data);
	}

	static String nextPermutation(String s)
	{
		int last = s.length() - 2;
		while(last >= 0)
		{
			if(s.charAt(last) < s.charAt(last + 1))
				break;

			last--;
		}

		int nextGreater = s.length() - 1;

		for(int i = s.length() - 1; i > last; i--)
			if(s.charAt(i) > s.charAt(last))
			{
				nextGreater = i;
				break;
			}

		s = swap(s, last, nextGreater);
		s = reverse(s, last + 1, s.length() - 1);

		return s;
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		int largestPalindromePrime = 0;
		for(int n = 1234567; n <= 7654321;)
		{
			if(isPrime(n))
				largestPalindromePrime = n;

			if(n == 7654321)
				break;

			n = Integer.parseInt(nextPermutation(Integer.toString(n)));
		}

		System.out.println(largestPalindromePrime);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}