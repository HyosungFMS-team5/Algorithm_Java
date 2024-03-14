import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 입력값 받기
    int[] numbers = new int[8];
    String[] input = br.readLine().trim().split(" ");
    for (int i = 0; i < 8; i++) numbers[i] = Integer.parseInt(input[i]);

    // 오름차순 내림차순 확인
    int diff = numbers[1] - numbers[0];
    String result = "mixed";
    for (int i = 1; i < 7; i++) {
      if ((diff != -1 && diff != 1) || numbers[i+1] - numbers[i] != diff) {
        result = "mixed";
        break;
      } 
      result = diff == 1 ? "ascending" : "descending";
    }

    // 정답 출력
    System.out.println(result);
  }
}