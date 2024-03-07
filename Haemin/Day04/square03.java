import java.util.Scanner;

public class square03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int num = 1;
		
		int[][] arr = new int[n][n];
		
		for(int i =0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[j][i] = num;
				num++;
			}
			
			
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%d", arr[i][j]);
			}
			System.out.println();
		}
		
		

	}

}
