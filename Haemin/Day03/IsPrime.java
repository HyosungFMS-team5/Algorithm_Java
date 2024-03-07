import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		
		// 입력받기 위한 scanner
		Scanner sc = new Scanner(System.in);

		// 기본값 
		boolean flag = true;
		
		int num = sc.nextInt();
		
		// 나누어 떨어진다면 소수가 아님
		// 1은 항상 나누어 떨어지므로 2부터 시작해야함.
		for(int i = 2; i < num/2 ; i++) {
			if(num%i == 0) {
				flag = false;
			}
			
		}
		
		if(flag == false) {
			System.out.println("소수가 아니다");
		}
		else {
			System.out.println("소수이다");
		}
		
		
	}

}
