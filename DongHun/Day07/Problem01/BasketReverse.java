import java.util.Scanner;

public class BasketReverse {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int n, m;
	        n = sc.nextInt();
	        m = sc.nextInt();

	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++)
	        {
	            arr[i] = i + 1; 
	        }

	        for (int i = 0; i < m; i++)
	        {
	            int start = sc.nextInt() - 1;
	            int end = sc.nextInt() - 1;
	            for (; start <= end; start++, end--) {
	                int temp = arr[start];
	                arr[start] = arr[end];
	                arr[end] = temp;
	            }
	        }
	        
	        for (int element : arr)
	        {
	            System.out.printf("%d ", element);
	        }

	}

}
