package asdfasdf;

import java.util.Scanner;

public class gugu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		for(int i = n1; i <= n2; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("[%d] * [%d] = [%d]", i, j, i*j);
				System.out.println();
			}
			System.out.println();
		}

	}

}
