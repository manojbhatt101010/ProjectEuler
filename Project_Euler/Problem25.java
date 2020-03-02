import java.math.BigInteger;

class Test
{
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		BigInteger a = BigInteger.ONE, b = BigInteger.ONE;

		for(int index = 3; ; index++)
		{
			BigInteger current = a.add(b);
			if(current.toString().length() == 1000)
			{
				System.out.println(index);
				break;
			}

			a = b;
			b = current;
		}

		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}










