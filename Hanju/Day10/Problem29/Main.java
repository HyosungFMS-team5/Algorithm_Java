import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
  // 필드 정의
  static int N;
  static String arr[][];
  static boolean[][] visited;
  static int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

  // 재귀 함수
  static void coloring(int r, int c) {
    // 방문 표시
    visited[r][c] = true;
    // 숫자 갱신
    if (arr[r][c].equals("0")) arr[r][c] = "2";
    // 이동
    for (int[] d: dir) {
      int nr = r + d[0];
      int nc = c + d[1];
      if (nr >= 0 && nr < N && nc >= 0 && nc < N && !visited[nr][nc]) {
        coloring(nr, nc);
      }
    }
  }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    // 입력값 할당
    N = Integer.parseInt(br.readLine().trim());
    arr = new String[N][N];
    visited = new boolean[N][N];

    for (int i = 0; i < N; i++) {
      String[] input = br.readLine().trim().split("");
      arr[i] = input;
    }

    // 숫자들 갱신
    coloring(0, 0);
    
    // 배열을 줄별로 출력
    for (String[] s : arr) {
      System.out.println(String.join("", s));
    }
  }
}