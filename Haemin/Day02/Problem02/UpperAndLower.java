package Quiz;

import java.util.Scanner;

/*
 대문자는 소문자로
 소문자는 대문자로 출력되도록 작성하시오.
 */

public class UpperAndLower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		// 문자열 객체를 CharArray로 반환
		char[] arr;
		
		arr = input.toCharArray();
		
		for(int i =0; i < arr.length; i++) {
			// i번째 배열 요소가 소문자냐 대문자냐
			// 문자는 아스키코드에 매핑된다. 
			if(arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] = (char)(arr[i]+ 'A'-'a');
			} else {
				arr[i] = (char)(arr[i] - 'A'-'a');
			}
		}
		
		System.out.print(arr);

	}

}
