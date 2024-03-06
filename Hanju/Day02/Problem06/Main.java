import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력값 할당
    String[] input = sc.nextLine().split(" ");
    int a = Integer.parseInt(input[0]);
    int b = Integer.parseInt(input[1]);

    // 최대공약수 구하기
    int n = 0;
    for (int i = Math.min(a, b); i > 0; i--) {
      if (a % i == 0 && b % i == 0) {
        n = i;
        break;
      }
    }

    // 최대공약수와 최대공배수 출력
    System.out.println(n);
    System.out.println(n * (int)(a/n) * (int)(b/n));
  }
}