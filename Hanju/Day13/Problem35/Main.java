import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  static int result;

  static void findOne(int n, int count) {
    if (count == result || n == 0) return;
    if (n == 1) result = count;
    if (n % 3 == 0) findOne(n/3, count+1);
    if (n % 2 == 0) findOne(n/2, count+1);
    findOne(n-1, count+1);
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    
    result = N;
    findOne(N, 0);
    System.out.println(result);
  }
}