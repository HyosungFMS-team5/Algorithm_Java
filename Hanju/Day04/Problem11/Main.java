import java.util.Arrays;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());

    int[][] arr = new int[N][N];
    
    int n = 0;
    for (int r = 0; r < N; r++) {
      if (r % 2 == 0) {
        for (int c = 0; c < N; c++) {
          arr[r][c] = ++n;
        }
      } else {
        for (int c = N - 1; c >= 0; c--) {
          arr[r][c] = ++n;
        }
      }
    }

    for (int i = 0; i < N; i++) {
      System.out.println(Arrays.toString(arr[i])); 
    }
  }
}