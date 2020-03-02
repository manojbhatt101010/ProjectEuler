import java.util.*;

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

		HashSet<Integer> set = new HashSet<>();
		int sum = 0;
		for(int a = 1; a <= 89; a++)
			for(int b = 123; b <= 9876; b++)
			{
				String s = "" + a + b + a * b;

				if(isPandigital(s) && !set.contains(a * b))
				{
					sum += a * b;
					set.add(a * b);
				}
			}

		System.out.println(sum);
		System.out.println(System.currentTimeMillis() - startTime + " ms");
	}
}

