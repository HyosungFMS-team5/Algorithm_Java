import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());

    int[][] arr = new int[N][N];

    for (int r = 0; r < N; r++) {
      for (int c = 0; c < N; c++) {
        arr[r][c] = (r+1) * (c+1);
      }
    }

    for (int r = 0; r < N; r++) {
      System.out.println(Arrays.toString(arr[r]));
    }
  }
}