package asdfasdf;

import java.util.Scanner;

/*
 1 2 3 4 
 2 4 6 8
 3 6 9 12
 4 8 12 16
 */
public class Numsquare04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] num = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				num[i][j] = (i+1) * (j+1);
				System.out.print(num[i][j]);
			}
			System.out.println();

		}

	}

}
