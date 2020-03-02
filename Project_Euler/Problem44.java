import java.util.ArrayList;

class Test
{
	static boolean isPentagonalNumber(int x)
	{
		return (1 + Math.sqrt(1 + 24 * x)) % 6 == 0;
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		ArrayList<Integer> list = new ArrayList<>();

	all:	for(int n = 1; ; n++)
		{
			int Pn = (n*(3*n - 1))/2;

			for(int i = list.size() - 1; i >= 0; i--)
				if(isPentagonalNumber(Pn - list.get(i)) && isPentagonalNumber(Pn + list.get(i)))
				{
					System.out.println(Pn - list.get(i));
					break all;
				}

			list.add(Pn);
		}

		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}