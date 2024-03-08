import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());

    int n = 0;
    int[][] arr = new int[N][N];
    for (int r = 0; r < N;r ++) {
      for (int c = 0; c < N; c++) {
        arr[r][c] = ++n;
      }
    }

    for (int r = 0; r < N;r ++) {
      for (int c = 0; c < N; c++) {
        System.out.print(arr[r][c] + " ");
      }
      System.out.println();
    }
  }
}
