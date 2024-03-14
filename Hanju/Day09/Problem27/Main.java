import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  static long factorial(long N) {
    return N == 0l? 1l : N * factorial((long)(N-1));
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    long N = Long.parseLong(br.readLine());
    System.out.println(factorial(N));
  }

}