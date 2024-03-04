import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 관련 변수들
    int[] scoreCount = new int[101];
    int avg = 0;
    int maxScore = 0;
    int maxCount = 0;

    // 점수를 입력 받으며 평균과 최빈값을 갱신
    for (int i = 0; i < 10; i++) {
      int score = (int)Integer.parseInt(sc.nextLine())/10;

      avg += score;

      scoreCount[score] += 1;
      if (scoreCount[score] > maxCount) {
        maxCount = scoreCount[score];
        maxScore = score * 10;
      }
    }

    // 정답 출력
    System.out.println(avg);
    System.out.println(maxScore);
  }
}