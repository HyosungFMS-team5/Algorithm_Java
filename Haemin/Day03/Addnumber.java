import java.util.Scanner;

public class Addnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		// �ڸ����� ���� �� �� ���Ұ���
		int result = 0;
		
		// �ڸ��� �ϳ��� �̾� ���� ���ؼ��� 10���� ���� ������ �̿�
		// ���ڸ� 10���� �����ִ� �� �������
		while (num != 0) {
			result += (num % 10);
			num /= 10;
		}
		
		System.out.println(result);
		

	}

}
