import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 풍선 개수, 실행문 개수 입력
    String[] input = br.readLine().trim().split(" ");
    int N = Integer.parseInt(input[0]);
    int M = Integer.parseInt(input[1]);

    // 풍선 배열의 초기값
    String[] ballonList = new String[N];
    for (int i = 0; i < N; i++) ballonList[i] = "" + (i+1);

    // 풍선 배열 뒤집기 실행문들 연산
    for (int i = 0; i < M; i++) {
      input = br.readLine().trim().split(" ");  // 시작과 끝
      int s = Integer.parseInt(input[0]);
      int e = Integer.parseInt(input[1]);
      for (int j = 0; j < (int)((e-s+1)/2); j++) {
        String tmp = ballonList[s + j - 1];
        ballonList[s + j - 1] = ballonList[e - 1 - j];
        ballonList[e - 1 - j] = tmp;
      }
    }
    
    // 정답 출력
    System.out.println(String.join(" ", ballonList));
  }
}