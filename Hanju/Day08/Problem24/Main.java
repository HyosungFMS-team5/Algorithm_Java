import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 입력값 받기
    String[] input = br.readLine().trim().split(" ");
    int m = Integer.parseInt(input[0]);
    int n = Integer.parseInt(input[1]);

    // 진수 변환
    String[] numMap = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
    StringBuilder result = new StringBuilder("");
    while (true) {
      result.append(numMap[m % n]);
      m /= n;
      if (m == 0) break;
    }

    // 출력
    System.out.println(result.reverse());
  }
}