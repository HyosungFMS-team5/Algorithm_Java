import java.util.Scanner;

public class OverAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int	input = sc.nextInt();
        
        for (int i = 0; i < input; i++) {
            int[] score = new int[sc.nextInt()];
            double count = 0;
            int sum = 0;
            
            for (int j = 0; j < score.length; j++) {
                score[j] = sc.nextInt();
                sum += score[j];
            }
            
            for (int j = 0; j < score.length; j++) {
                if(score[j] > sum / score.length) {
                    count++;
                }
            }
            
            System.out.printf("%.3f",(count/ score.length) * 100);
            System.out.println("%");
        }
	}

}
