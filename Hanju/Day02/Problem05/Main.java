import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 입력값 받기
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine().trim();
    
    // 글자마다 대소문자 변경
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < input.length(); i++) {
      char s = input.charAt(i);
      result.append(s > 96? (char)(s - 32): (char)(s + 32));
    }

    // 정답 출력
    System.out.println(result.toString());
  }
}