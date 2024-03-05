package Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student st1 = new Student("손오공" , "1682");
		Student st2 = new Student("저팔계" , "1772");
		Student st3 = new Student("사오정" , "1813");
		
		// 리스트 생성
		// Student의 참조 변수들을 넣을거니까 <student>로 넣어준다.
		ArrayList <Student>list = new ArrayList<Student>();
		
		// list에 값을 추가하는 것
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		// for문이 진행될 때 마다 순회하는 것을 말함
		for(Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("계속 검색하고싶으면 y, 종료하고 싶으면 n");
		
		while (true) {
			String input = scan.next();
			// 학생 이름이 잇으면 true
			boolean flag = false;
			
			if(input.equals("y")) {
				System.out.println("검색을 시작합니다.");
				// 학생 이름 바딕
				String name = scan.next();
				for(Student stu: list) {
					if(stu.getName().equals(name)) {
						System.out.println(stu.getNo());
						// 학생 이름 있으니까
						flag = true;
					} 
					
				}
				if (!flag) {
					System.out.println("해당하는 학생 이름이 없습니다.");
				}
				
			} else if (input.equals("n")) {
				break;
			}
		}
		
		System.out.println("프로그램이 종료되었습니다.");
		
	}

}
