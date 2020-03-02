import java.util.Arrays;

class Test
{
	static void swap(int data[], int a, int b)
	{
		int temp = data[a];
		data[a] = data[b];
		data[b] = temp;
	}

	static void reverse(int[] data, int a, int b)
	{
		while(a < b)
		{
			int temp = data[a];
			data[a++] = data[b];
			data[b--] = temp;
		}
	}

	static void nextPermutation(int data[])
	{
		int last = data.length - 2;
		while(last >= 0)
		{
			if(data[last] < data[last + 1])
				break;

			last--;
		}

		int nextGreater = data.length - 1;
		
		for(int i = data.length - 1; i > last; i--)
			if(data[i] > data[last])
			{
				nextGreater = i;
				break;
			}

		swap(data, last, nextGreater);
		reverse(data, last + 1, data.length - 1);
	}

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();

		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

		for(int i = 1; i < 1000000; i++)
			nextPermutation(arr);

		for(int i = 0; i < 10; i++)
			System.out.print(arr[i]);

		System.out.println();
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}










