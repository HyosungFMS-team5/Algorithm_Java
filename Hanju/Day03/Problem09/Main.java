import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.nextLine());

    int result = 0;
    for (String number : sc.nextLine().split("")) {
      result += Integer.parseInt(number);
    }

    System.out.println(result);
  }
}