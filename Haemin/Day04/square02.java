import java.util.Scanner;

public class square02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		// num*num 硅凯 积己
		int[][] arr = new int[num][num];
		
		
		for(int i = 0; i < num; i++) {
			
			// 0青, 2青
			if(i % 2 == 0) {
				for(int j = 0; j < num; j++) {
					arr[i][j] = (num*i) + (j+1);
					System.out.printf("%d", arr[i][j]);
				}
			}
			
			// 1青, 3青
			else {
				for(int j = 0; j < num; j++) {
					arr[i][j] = (num*(i+1)) + (-j);
					System.out.printf("%d", arr[i][j]);
				}

			}
			

			System.out.println();
		}
		

	}

}
