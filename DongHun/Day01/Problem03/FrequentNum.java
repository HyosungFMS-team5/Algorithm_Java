import java.util.Arrays;
import java.util.Scanner;

public class FrequentNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []numberList = new int[10];
		for (int i = 0; i < 10; i++) {
			numberList[i] = Integer.parseInt(sc.next());
		}
		
        int[] numbers = new int[10];
        
        for (int i = 0; i < 10; i++) {
        	numbers[numberList[i]]++;
        }
        
        int frequentNum = 0;
        int cnt = 0;
        
        for (int i = 0; i < 10; i++) {
        	if (cnt < numbers[i]) {
        		cnt = numbers[i];
        		frequentNum = i;
        	}
        }
        
        System.out.println(frequentNum);
        System.out.println(cnt);

	}

}
