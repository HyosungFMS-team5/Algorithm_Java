package E01;

import java.util.Scanner;

/*
 * 234 ->  
 * 2
 * 3
 * 4
 * 
 */
// 높은 자릿수 부터 추출
public class Algorithm01 {
	public static void extract(int N) {
		if(N / 10 == 0) {
			System.out.println(N);
			return;
		}
		
		extract(N/10);
		System.out.println(N%10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		extract(num);

	}

}
