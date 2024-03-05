import java.util.Scanner;

public class numSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();

        int ans = 0;
        for (int i = 0; i < a.length(); i++) {
            ans += Character.getNumericValue(a.charAt(i));
        }

        System.out.println(ans);
    }
}