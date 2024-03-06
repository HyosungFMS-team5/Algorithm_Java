import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력값 할당
    int N = Integer.parseInt(sc.nextLine());

    // 소수들 정의
    boolean[] notDicimals = new boolean[1001];
    notDicimals[1] = true;
    for (int i = 2; i <= 1000; i++) {
      if (!notDicimals[i]) {
        for (int j = 2*i; j <= 1000; j += i) {
          notDicimals[j] = true;
        }
      }
    }

    // 소수 개수 
    int count = 0;
    for (String number : sc.nextLine().trim().split(" ")) {
      if (!notDicimals[Integer.parseInt(number)]) count++;
    }

    // 출력
    System.out.println(count);
  }
}
