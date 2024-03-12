import java.util.Scanner;

public class PlusCycle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
        int cnt = 0;
		int num2 = num;
        
		do {
			num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
			cnt++;
		} while (num2 != num);
		
		System.out.println(cnt);

	}

}
