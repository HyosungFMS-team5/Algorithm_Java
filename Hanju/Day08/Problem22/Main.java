import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] numbers = br.readLine().trim().split(" ");

    // 일의 자리부터 비교하며 큰 수 산출
    String bigger = numbers[0];
    for (int i = 2; i >= 0; i--) {
      if (numbers[1].charAt(i) == numbers[0].charAt(i)) continue;
      if (numbers[1].charAt(i) > numbers[0].charAt(i)) bigger = numbers[1];
      break;
    }

    // 출력
    for (int i = 2; i >= 0; i--) {
      System.out.print(bigger.charAt(i));
    }
  }
}