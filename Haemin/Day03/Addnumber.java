import java.util.Scanner;

public class Addnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		// 자릿수의 합을 각 각 더할것임
		int result = 0;
		
		// 자릿수 하나씩 뽑아 내기 위해서는 10으로 나눈 나머지 이용
		// 숫자를 10으로 나눠주는 몫 저장까지
		while (num != 0) {
			result += (num % 10);
			num /= 10;
		}
		
		System.out.println(result);
		

	}

}
