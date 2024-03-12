import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 테스트 케이스 수
    int C = Integer.parseInt(br.readLine());

    // 케이스 별로 평균 이상 비율 구하기
    for (int c = 0; c < C; c++) {
      String[] input = br.readLine().trim().split(" ");
      int N = Integer.parseInt(input[0]);

      // 평균 구하기
      int sum = 0;
      for (int i = 1; i <= N; i++) {
        sum += Integer.parseInt(input[i]);
      }

      // 평균 이상인 사람 수 구하기
      int count = 0;
      for (int i = 1; i <= N; i++) {
        if (Integer.parseInt(input[i])*N > sum) count += 1;
      }

      DecimalFormat df = new DecimalFormat("0.000%");
      System.out.println(df.format((double)count / (double)N));
    }
  }
}