import java.util.Scanner;

public class square01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		// num*num 배열 생성
		int[][] arr = new int[num][num];
		
		for(int i =0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				arr[i][j] = (num*i)+(j+1); 
				System.out.printf("%d ", arr[i][j]);
			}
			
			System.out.println();
			
		}
		
		

	}

}
