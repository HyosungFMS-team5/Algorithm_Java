import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  static StringBuilder s = new StringBuilder("");

  static void binary(int N) {
    if (N == 0) return;
    s.append((N % 2) + "");
    binary(N / 2);
  }
  
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    binary(N);
    System.out.println(s.reverse());
  }
}