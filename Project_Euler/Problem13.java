import java.util.Scanner;
import java.math.BigInteger;

class Test
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);

		BigInteger sum = BigInteger.ZERO;
		for(int i = 0; i < 100; i++)
			sum = sum.add(read.nextBigInteger());

		long startTime = System.currentTimeMillis();

		System.out.println(sum.toString().substring(0, 10));
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}