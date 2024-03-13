import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 입력값
    int N = Integer.parseInt(br.readLine());
    int target = Integer.parseInt(br.readLine());

    // 설정값
    String[][] arr = new String[N][N]; // 달팽이 배열
    int[] loc = new int[2];  // 현재 위치
    int[] d = {1, 0};  // 방향
    int[] limit = {-1, N, -1, N};  // 위, 아래, 왼쪽, 아래쪽

    // 배열에 숫자를 넣고 타겟 위치 구하기
    String[] targetLoc = {"", ""};
    for (int n = N*N; n > 0; n--) {
      // 숫자 할당
      arr[loc[0]][loc[1]] = n + "";
      if (n == target) targetLoc = new String[]{(loc[0] + 1) + "", (loc[1] + 1) + ""};
      // 방향을 바꿀지 판단
      if (loc[0] + d[0] == limit[1]) {
        d[0] = 0; 
        d[1] = 1;
        limit[2]++;
      } else if (loc[1] + d[1] == limit[3]) {
        d[0] = -1; 
        d[1] = 0;
        limit[1]--;
      } else if (loc[0] + d[0] == limit[0]) {
        d[0] = 0; 
        d[1] = -1;
        limit[3]--;
      } else if (loc[1] + d[1] == limit[2]) {
        d[0] = 1; 
        d[1] = 0;
        limit[0]++;
      }
      // 이동
      loc[0] += d[0];
      loc[1] += d[1];
    }
    
    // 출력
    for (String[] row : arr) {
      System.out.println(String.join(" ", row));
    }
    System.out.println(String.join(" ", targetLoc));
  }
}