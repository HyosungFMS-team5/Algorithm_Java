import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  static int plus(int start, int end) {
    return start == end? end : start + plus(start+1, end);
  }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().trim().split(" ");

    System.out.println(plus(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
  }
}