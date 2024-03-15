package A;





public class Snail3 {

	public static void main(String[] args) {
		int snailn = 4;
		
		int arr[][] = new int[10][10];
		
		int x = 0;
		int y = 0;
		
		int num = 1;
		
		int f = snailn;
		
		for(int i = 0; i < snailn*2 -1; i++) {
			switch(i%4) {
			case 0: // right way
				for(int k=0; k <snailn; k++) {
					arr[y][x] = num;
					x++;
					num++;
					
				}
				x--;
				y++;
				
				f--;
				break;
				
			
			case 1: // under way
				for(int k=0; k <snailn; k++) {
					arr[y][x] = num;
					y++;
					num++;
					
				}
				
				y--;
				x--;
				
				
				break;
				
			case 2: // left way
				for(int k=0; k <snailn; k++) {
					arr[y][x] = num;
					x--;
					num++;
					
				}
				x++;
				y--;
				
				f--;
				break;
				
			case 3: // high way
				for(int k=0; k <snailn; k++) {
					arr[y][x] = num;
					x--;
					num++;
					
				}
				x++;
				y++;

				
				break;
			}
		}
		for(int i = 0; i < snailn; i++) {
			for(int j = 0; j < snailn; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		

	}

}
