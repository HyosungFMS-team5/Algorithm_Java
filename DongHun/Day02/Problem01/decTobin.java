import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class decTobin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.nextLine()); // 자료 최대 크기가 커서 int로 받으면 예외 터짐 
		
		ArrayList<Long> arr = new ArrayList<>();
		
		for (int i = 0; 0 < n; i++) {
			long temp = n % 2;
			n /= 2;
			arr.add(temp);
		}
		
		Collections.reverse(arr); // 배열 뒤집기
		
		for (long i:arr) {
			System.out.print(i);
		}
		
	}

}
