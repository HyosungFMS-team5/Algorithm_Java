import java.util.Scanner;

public class Fibonacci {
	
	static int[] dp = new int[1000];
	static int fibonacci(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		if (dp[n] != 0) return dp[n];
		dp[n] = fibonacci(n - 2) + fibonacci(n - 1);
		return dp[n];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i <= n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

}
