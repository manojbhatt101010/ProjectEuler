import java.util.Arrays;

class Test
{
	static boolean containSameDigits(String a, String b)
	{
		char[] c1 = a.toCharArray(), c2 = b.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		return new String(c1).equals(new String(c2));
	}

	static boolean isRight(int x)
	{
		for(int n = 2; n <= 6; n++)
			if(!containSameDigits(Integer.toString(x), Integer.toString(n*x)))
				return false;

		return true;
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		int y = 18;
		for(int x = 10; ; x++)
		{
			if(x == y)
			{
				y *= 10;
				x = (x * 100)/18;
			}

			else if(isRight(x))
			{
				System.out.println(x);
				break;
			}
		}

		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}