package A;

import java.util.Scanner;

public class Factorial {
	
	static int Factorial(int n, int result){
		result *= n;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = 1; // 곱하기니까 0 으로 시작하면 안됨.
		
		while(num != 0) {
			result = Factorial(num, result);
			num--;
		}
		
		System.out.println(result);
	}

}
