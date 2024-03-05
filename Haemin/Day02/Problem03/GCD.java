package Quiz;

// 최대 공약수 구하기

public class GCD {

	public static void main(String[] args) {
		
		int num1, num2;
		int gcd = 0;
		
		num1 = 15;
		num2 = 30;
		
		int small = (num1 < num2 ) ? num1 : num2;
		
		for(int i = 1; i <= small; i++) {
			if((num1 % i == 0) && (num2 % i == 0)) {
				gcd = i;
			}
		}
		
		System.out.println(gcd);
	}

}
