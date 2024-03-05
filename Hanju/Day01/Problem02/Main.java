import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());

    fiboArray[1] = 1;

    System.out.println(fibonacci(n));
  }

  // dp를 위한 배열
  public static int[] fiboArray = new int[46];

  // 재귀를 활용한 피보나치 함수
  public static int fibonacci(int n) {
    int result = 0;
    if (n <= 1) result = n;
    else if (fiboArray[n] != 0) result = fiboArray[n];
    else {
      result = fibonacci(n-1) + fibonacci(n-2);
      fiboArray[n] = result;
    }
    return result;
  }
}