package E01;

import java.util.Scanner;

public class Algorithm02 {

	public static void trans(int n) {
		// 17 >  1 0 0  0 1
		
		if(n/2 == 0) {
			System.out.println(n%2);
			return;
		}
		System.out.println(n%2);
		trans(n/2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		trans(num);
	}

}
