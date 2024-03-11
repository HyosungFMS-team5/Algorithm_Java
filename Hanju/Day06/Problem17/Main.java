import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력값 받기
    int N = Integer.parseInt(sc.nextLine());
    String[] holdList = sc.nextLine().trim().split(" ");
    int M = Integer.parseInt(sc.nextLine());
    String[] countList = sc.nextLine().trim().split(" ");

    // 맵을 이용하여 개수세기
    HashMap<String, Boolean> countMap = new HashMap<>();
    for (String s : holdList) countMap.put(s,true);

    // 존재확인
    String[] result = new String[M];
    for (int i = 0; i < M; i++) {
      result[i] = countMap.containsKey(countList[i])? "1" : "0";
    }

    System.out.println(String.join(" ", result));
  }
}
