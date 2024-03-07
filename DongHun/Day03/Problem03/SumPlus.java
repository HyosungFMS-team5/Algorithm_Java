import java.util.Scanner;

public class SumPlus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character after the integer input
        String num = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += Character.getNumericValue(num.charAt(i));
        }

        System.out.println(sum);

	}

}
