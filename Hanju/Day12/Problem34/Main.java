import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  static int[] counts = new int[12];

  static int plus(int n) {
    if (counts[n] == 0) counts[n] = plus(n-3) + plus(n-2) + plus(n-1); 
    return counts[n];
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    counts[0] = 1;
    counts[1] = 1;
    counts[2] = 2;

    for (int i = 0; i < N; i++) {
      int n = Integer.parseInt(br.readLine());
      System.out.println(plus(n));
    }
  } 

}