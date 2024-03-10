package Quiz;

import java.util.Scanner;

/*
  10진수를 2진수로 변환하시오
  
 */
public class Problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 10진수를 입력 받음
		int num = sc.nextInt();
		
		// 2진수로 변환될 때 값들을 저장할 Array
		int bin[] = new int[100];
		
		int cnt = 0;
		
		while(num != 0) {
			
			bin[cnt] = num % 2;
			
			num /= 2;
			cnt++;
		}
		cnt--;
		
		for (; cnt >=0; cnt--) {
			System.out.println(bin[cnt]);
		}
		

	}

}
