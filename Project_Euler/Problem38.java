import java.util.Arrays;

class Test
{
	static boolean isPandigital(String s)
	{
		if(s.length() != 9)
			return false;

		char[] c = s.toCharArray();
		Arrays.sort(c);

		return new String(c).equals("123456789");
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		String largest = "";
		for(int n = 9183; n < 10000; n++)
		{
			String s = "" + n + n*2;

			if(isPandigital(s))
				largest = s;
		}

		System.out.println(largest);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}