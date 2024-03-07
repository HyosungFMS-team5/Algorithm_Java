import java.util.ArrayList;
import java.util.Scanner;

public class find {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int result = 0;
        
        for (int i : arr) {
            int cnt = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                result++;
            }
        }
        
        System.out.println(result);
		
	}

}
