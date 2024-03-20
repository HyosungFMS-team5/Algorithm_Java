import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int[] counts = new int[N+1];
    for (int i = 2; i <= N; i++) counts[i] = N;

    for (int i = 1; i < N; i++) {
      if (i + 1 <= N && counts[i]+1 < counts[i+1]) counts[i+1] = counts[i]+1;
      if (2 * i <= N && counts[i]+1 < counts[2*i]) counts[2*i] = counts[i]+1;
      if (3 * i <= N && counts[i]+1 < counts[3*i]) counts[3*i] = counts[i]+1;
    }
    
    System.out.println(counts[N]);
  }
}