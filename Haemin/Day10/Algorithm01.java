package f0318;

import java.util.Scanner;


 
// 입력된 두 수 까지의 합 출력하기
public class Algorithm01 {
	
	public static int col(int num, int num2) {
		
		if (num == num2) {
			return num;
		}
		return num+col(num+1,num2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum = 0;
		
		sum = col(num,num2);
		
		System.out.println(sum);

	}

}
