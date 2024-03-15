package A;

import java.util.Scanner;

// 입력된 숫자까지 + - 를 차례대로 반복하시오.

public class PlusMinus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(i==n) {
				System.out.print(i);
			}else if (i% 2 == 1){
				System.out.print(i + "+");
			}else if(i%2==0) {
				System.out.print(i + "-");
			}
		}
	}

}
