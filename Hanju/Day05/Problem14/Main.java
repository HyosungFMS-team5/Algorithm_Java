import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력값 받기
    int N = Integer.parseInt(sc.nextLine());
    String[] inputArr = sc.nextLine().split(" ");
    int v = Integer.parseInt(sc.nextLine());
  
    // 숫자배열을 통해 개수 갱신
    int[] countArr = new int[201];
    for (int i = 0; i < N; i++) {
      int n = Integer.parseInt(inputArr[i]);
      countArr[n + 100]++;
    }

    // v의 개수 출력
    System.out.println(countArr[v + 100]);
  }
}