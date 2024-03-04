package Quiz;

import java.util.Scanner;

// 가장 많이 출력된거 출력하기

public class ModeNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] inputNum = new int[10];
		
		for(int i =0; i < 10; i++) {
			inputNum[i] = scan.nextInt();
		}
		
		// 최빈수 Mode
		int []mode = new int[10];
		
		// mode[3] -> 5 라는 의미 : 3의 값이 5번 들어있다.
		for(int i = 0; i < 10; i++) {
			mode[inputNum[i]]++;
		}
		
		int modeNum = 0;
		int modeCnt = 0;
		
		for(int i = 0; i <10; i++) {
			if(modeCnt < mode[i]) {
				modeNum = i;
			}
		}
		
		System.out.println("최빈수는 " + modeNum);
		

	}

}
