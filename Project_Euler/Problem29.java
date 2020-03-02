import java.util.HashSet;
import java.math.BigInteger;

class Test
{
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		HashSet<BigInteger> set = new HashSet<>();

		for(int a = 2; a <= 100; a++)
			for(int b = 2; b <= 100; b++)
				set.add(BigInteger.valueOf(a).pow(b));

		System.out.println(set.size());
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}

