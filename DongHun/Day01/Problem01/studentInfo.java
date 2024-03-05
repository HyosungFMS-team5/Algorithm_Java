import java.util.ArrayList;
import java.util.Scanner;

public class studentInfo {

	public static void main(String[] args) {
		
		Student student1 = new Student("김한주","1");
		Student student2 = new Student("윤다인","2");
		Student student3 = new Student("윤동훈","3");
		Student student4 = new Student("전혜민","4");
		
		ArrayList <Student>studentList = new ArrayList<Student>();
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		
		Scanner sc = new Scanner(System.in);
	
		while (true) {
			System.out.println("계속 검색 하시겠습니까? Y/N");
			String answer = sc.nextLine();

			
			if (answer.equals("Y")) {
				System.out.print("이름을 입력하세요 : ");
				String name = sc.nextLine();
				boolean flag = true;
				
				for (Student student:studentList) { // forEach 
					if (student.getName().equals(name)) {
						System.out.printf("%s님의 학번은 %s번 입니다.\n",name,student.getNo());
						flag = true;
					}
				}
				
				if (!flag) System.out.print("해당하는 학생이 없습니다.");
			} else {
				break;
			}
			
		}
		
		System.out.println("프로그램 종료");
	}

}
