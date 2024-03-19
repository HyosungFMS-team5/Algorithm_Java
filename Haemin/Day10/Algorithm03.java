package f0318;

import java.util.Scanner;

public class Algorithm03 {

	public static int pibonacci(int n) {
		
		if(n == 1) return 1;
		if(n==2) return 1;
		
		return pibonacci(n-1)+pibonacci(n-2);
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(pibonacci(n));

	}

}
