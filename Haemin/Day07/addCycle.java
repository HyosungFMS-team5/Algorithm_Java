package alonestudy;

import java.util.Scanner;

public class addCycle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int answer = n;
		
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		
		int cnt = 0;
		
		while(true) {
			n1 %= 10;
			n2 /= 10;
			n3 = n1+n2;
			
			n = n3%10 + (n2*10);
			
			cnt++;
			
			if(n == answer) {
				break;
			}
			
		}
		
		System.out.println(cnt);
		

	}

}
