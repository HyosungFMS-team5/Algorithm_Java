import java.util.Scanner;

public class Lower_Upper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String ans = "";

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (Character.isUpperCase(ch)) ans += Character.toLowerCase(ch);
            else if (Character.isLowerCase(ch)) ans += Character.toUpperCase(ch);
        }

        System.out.println(ans);
    }
}