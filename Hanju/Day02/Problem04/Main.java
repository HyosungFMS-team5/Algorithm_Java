import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 십진수 N
    long N = Long.parseLong(sc.nextLine());

    // 2진수 변환(역순으로 저장됨)
    StringBuilder binary = new StringBuilder();
    while (N > 0) {
      binary.append(N % 2);
      N = (long)N/2;
    }

    // 2진수 출력
    System.out.println(binary.reverse().toString());
  }
}