class Test
{
	static long[][] arr = new long[21][21];

	static long findPaths(int a, int b)
	{
		if(a == 0 || b == 0)
			return 1;

		if(arr[a][b] != 0)
			return arr[a][b];

		arr[a][b] = findPaths(a-1, b) + findPaths(a, b-1);

		return arr[a][b];
	}

	public static void main(String[] args)
	{
		System.out.println(findPaths(20, 20));
	}
}

