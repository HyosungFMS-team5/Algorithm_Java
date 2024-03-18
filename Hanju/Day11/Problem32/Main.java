import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  static int N;

  static int[][] map;

  static int[][] dir = {{0, 1}, {1, 0}, {0 , -1}, {-1, 0}};

  static void findHouse(int sr, int sc, int r, int c) {
    // 방문 표시
    map[r][c] = 0;
    map[sr][sc]++;
    // 4방향 탐색
    for (int[] d : dir) {
      int nr = r + d[0];
      int nc = c + d[1];
      if (nr >= 0 && nr < N && nc >= 0 && nc < N && map[nr][nc] == 1) {
        findHouse(sr, sc, nr, nc);
      }
    }
    
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 지도 크기
    N = Integer.parseInt(br.readLine());
    // 지도 정보
    map = new int[N][N];
    for (int r = 0; r < N; r ++) {
      String row = br.readLine().trim();
      for (int c = 0; c < N; c ++) {
        map[r][c] = row.charAt(c) - '0';
      }
    }

    // 지도를 돌면서 아파트 단지 체크
    List<Integer> result = new ArrayList<Integer>();
    for (int r = 0; r < N; r ++) {
      for (int c = 0; c < N; c ++) {
        if (map[r][c] == 1) {
          findHouse(r, c, r, c);
          result.add(map[r][c]);
        }
      }
    }
    
    // 정답 출력
    Collections.sort(result);
    System.out.println(result.size());
    for (int i : result) {
      System.out.println(i);
    }
  }
}