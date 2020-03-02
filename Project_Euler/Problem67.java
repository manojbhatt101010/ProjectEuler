import java.util.Scanner;

class Test
{
	int[][] arr, save;
	int n;

	Test(int n) {
		this.n = n;
		arr = new int[n][n];
		save = new int[n][n];

		Scanner read = new Scanner(System.in);
		for(int i = 0; i < n; i++) {
			arr[i] = new int[i+1];
			save[i] = new int[i+1];

			for(int j = 0; j < i + 1; j++)
				arr[i][j] = read.nextInt();
		}
	}

	int findPath(int r, int c) {
		if(r == n - 1)
			return arr[r][c];

		if(save[r][c] == 0)
			save[r][c] = arr[r][c] + Math.max(findPath(r + 1, c), findPath(r + 1, c + 1));

		return save[r][c];
	}

	public static void main(String[] args) {
		Test obj = new Test(100);
		long startTime = System.currentTimeMillis();

		System.out.println(obj.findPath(0, 0));
		System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
	}
}
