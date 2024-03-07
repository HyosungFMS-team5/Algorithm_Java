import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		// 결과는 1로 초기화, 0으로 곱하면 0값이 나오기 떄문
		int result = 1; 
		
		for (int i =1; i <= num; i++) {
			result *= i;
		}
		
		System.out.println(result);


	}

}
