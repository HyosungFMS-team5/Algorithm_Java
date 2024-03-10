package asdfasdf;

import java.util.Scanner;

/*
 입력된 숫자의 개수 출력
 
 421314218
 
 0 : 0
 ...
 */
public class Countnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		// 개수 세기
		int[] cnt = new int[10];
		
		// num을 String 타입으로 변환
		String stringnum = "" + num;
		
		System.out.println(stringnum);
		System.out.println(stringnum.length());
		
		//4213
		for(int i =0; i < stringnum.length(); i++) {
			cnt[(int)(stringnum.charAt(i) - '0')]++;
			

		}
		
		for(int k =0; k < cnt.length; k++) {
			System.out.printf("[%d] : [%d]", k, cnt[k]);
			System.out.println();
		}


	}

}
