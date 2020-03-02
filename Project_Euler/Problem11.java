import java.util.Scanner;

class Test
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);

		int[][] grid = new int[20][20];

		for(int i = 0; i < 20; i++)
			for(int j = 0; j < 20; j++)
				grid[i][j] = read.nextInt();

		long startTime = System.currentTimeMillis();

		int maxProduct = 1;
		for(int i = 0; i < 16; i++)
			for(int j = 0; j < 16; j++)
			{
				int product = grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+3];
				if(product > maxProduct)
					maxProduct = product;

				product = grid[i][j] * grid[i+1][j] * grid[i+2][j] * grid[i+3][j];
				if(product > maxProduct)
					maxProduct = product;

				product = grid[i][j] * grid[i+1][j+1] * grid[i+2][j+2] * grid[i+3][j+3];
				if(product > maxProduct)
					maxProduct = product;
			}

		for(int i = 0; i < 16; i++)
			for(int j = 19; j > 2; j--)
			{
				int product = grid[i][j] * grid[i+1][j-1] * grid[i+2][j-2] * grid[i+3][j-3];
				if(product > maxProduct)
					maxProduct = product;
			}

		System.out.println(maxProduct);
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}