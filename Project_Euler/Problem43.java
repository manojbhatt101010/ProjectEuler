import java.util.Arrays;

class Test
{
	static void swap(char data[], int a, int b)
	{
		char temp = data[a];
		data[a] = data[b];
		data[b] = temp;
	}

	static void reverse(char[] data, int a, int b)
	{
		while(a < b)
		{
			char temp = data[a];
			data[a++] = data[b];
			data[b--] = temp;
		}
	}

	static boolean nextPermutation(char data[])
	{
		int last = data.length - 2;
		while(last >= 0)
		{
			if(data[last] < data[last + 1])
				break;

			last--;
		}

		if(last == -1)
			return false;

		int nextGreater = data.length - 1;

		for(int i = data.length - 1; i > last; i--)
			if(data[i] > data[last])
			{
				nextGreater = i;
				break;
			}

		swap(data, last, nextGreater);
		reverse(data, last + 1, data.length - 1);

		return true;
	}

	static boolean followsProperty(char[] arr)
	{
		int[] brr = {2, 3, 5, 7, 11, 13, 17};

		for(int i = 1; i < 8; i++)
		{
			long n = Long.parseLong(new String(arr, i, 3));
			if(n % brr[i-1] != 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

		long sum = 0, n = 10;
		while(nextPermutation(arr))
			if(followsProperty(arr))
				sum += Long.parseLong(new String(arr));

		System.out.println(sum);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}