import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		
		// �Է¹ޱ� ���� scanner
		Scanner sc = new Scanner(System.in);

		// �⺻�� 
		boolean flag = true;
		
		int num = sc.nextInt();
		
		// ������ �������ٸ� �Ҽ��� �ƴ�
		// 1�� �׻� ������ �������Ƿ� 2���� �����ؾ���.
		for(int i = 2; i < num/2 ; i++) {
			if(num%i == 0) {
				flag = false;
			}
			
		}
		
		if(flag == false) {
			System.out.println("�Ҽ��� �ƴϴ�");
		}
		else {
			System.out.println("�Ҽ��̴�");
		}
		
		
	}

}
