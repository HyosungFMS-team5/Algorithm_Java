package A;

import java.util.Scanner;

public class AscDesMix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[8];
		
		boolean ascTrue = true;
		boolean descTrue = true;
		
		// descending 검사 위한 변수
		int k = 1;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		// Ascending 검사
		for(int i = 0; i < num.length; i++) {
			if(!(num[i] == i+1)) {
				ascTrue = false;
				break;
			}
			
		}
		
		if(ascTrue) {
			System.out.println("ascending");
		}
		else {
			for(int i = num.length-1; i >= 0; i--) {
				if(!(num[i] == k)) {
					descTrue = false;
				}
				k++;
			}
			
			
			if(descTrue) {
				System.out.println("descending");
			}
			else {
				System.out.println("mixed");
			}
		}

	}

}
