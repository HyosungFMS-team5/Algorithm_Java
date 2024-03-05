public class Student {
  // 필드 정의
  String name;
  private int no;
  
  // 생성자 정의
  public Student(String name, int no) {
    this.name = name;
    this.no = no;
  }

  // 함수 - 학생 이름 반환
  public String getName() {
    return this.name;
  }

  // 함수 - 학생 학번 반환
  public int getNo() {
    return this.no;
  }
}
