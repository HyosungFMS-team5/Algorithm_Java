import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      // 입력값 받기
      char[] palindrome = br.readLine().toCharArray();
      // 종료
      if (palindrome[0] == '0') break;
      // 팰린드롬 판단
      int totalLength = palindrome.length;
      boolean isPalindrome = true;
      for (int i = 0; i < (int)(totalLength/2); i++) {
        if (palindrome[i] != palindrome[totalLength - i - 1]) {
          isPalindrome = false;
          break;
        }
      }
      System.out.println(isPalindrome? "yes" : "no");
    }
  }
}