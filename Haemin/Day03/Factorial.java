import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		// ����� 1�� �ʱ�ȭ, 0���� ���ϸ� 0���� ������ ����
		int result = 1; 
		
		for (int i =1; i <= num; i++) {
			result *= i;
		}
		
		System.out.println(result);


	}

}
