import java.util.Scanner;

public class NumSquare3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] arr = new int[N][N];
        int cnt = 1;

        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N; i++) {
                arr[i][j] = cnt++;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

	}

}
