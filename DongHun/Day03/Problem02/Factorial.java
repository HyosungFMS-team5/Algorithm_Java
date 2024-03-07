import java.util.Scanner;

public class Factorial {
	
	static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(factorial(n));

	}

}
