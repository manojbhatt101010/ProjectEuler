import java.util.*;

class Test
{
	static int sumOfDivisors(int n)
	{
		int sum = 1, sqrtN = (int)Math.sqrt(n);

		for(int i = 2; i <= sqrtN; i++)
			if(n % i == 0)
				sum += (i + n/i);

		if(Math.sqrt(n) - sqrtN == 0)
			sum -= sqrtN;

		return sum;
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		long totalSum = 395465626L;
		ArrayList<Integer> list1 = new ArrayList<>();
		HashSet<Integer> list2 = new HashSet<>();

		for(int n = 1; n < 28112; n++)
			if(sumOfDivisors(n) > n)
			{
				list1.add(n);

				for(int i = 0; i < list1.size(); i++)
				{
					int sum = n + list1.get(i);
					if(sum < 28124 && !list2.contains(sum))
					{
						totalSum -= sum;
						list2.add(sum);
					}
				}
			}

		System.out.println(totalSum);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}