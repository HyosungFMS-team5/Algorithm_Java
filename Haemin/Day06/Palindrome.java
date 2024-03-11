package alonestudy;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean flag = true;
		
		String s = "" + n;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
				flag = false;
			}
		}
		
		System.out.println(flag);


	}

}
