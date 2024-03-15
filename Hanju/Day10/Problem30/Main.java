import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  static void printChar(String s, int idx, int max) {
    if(idx == max) return;
    System.out.println(s.charAt(idx));
    printChar(s, idx+1, max);
  }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine().trim();

    printChar(input, 0, input.length());
  }
}