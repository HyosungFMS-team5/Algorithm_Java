import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 학생 배열 정의
    ArrayList<Student> students = new ArrayList<Student>();
    students.add(new Student("김갑", 1));
    students.add(new Student("박병", 2));
    students.add(new Student("최병", 3));

    // 검색 진행
    String endInput = "y";  // 검색 종료 입력값
    while (!endInput.equals("n")) {
      switch (endInput) {
        // 검색 진행
        case "y":
          // 학생 이름 입력
          System.out.println("학생 검색을 시작합니다. 이름을 입력해주세요.");
          String nameInput = sc.nextLine();
          // 학생 이름 검색
          boolean isIn = false;
          for (Student student: students) {
            if (student.getName().equals(nameInput)) {
              System.out.println("학번 : " + student.getNo());
              isIn = true;
              break;
            }
          }
          // 없는 학생일 경우
          if (!isIn) System.out.println("없는 학생입니다.");
          break;
        // 잘못된 입력값
        default:
          System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
          break;
      }
      // 사용자 입력에 따라 종료 여부 결정
      System.out.println("검색을 계속하시겠습니까?(y / n)");
      endInput = sc.nextLine();
    } 
    System.out.println("검색을 종료하겠습니다.");
  }
}
