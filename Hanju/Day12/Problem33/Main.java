import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  static int order (int n, int k) {
    int coupon = n / k;
    int mod = n % k;
    return n < k ? n :  n - mod + order(mod + coupon, k); 
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    while (true) {
      try {
        String[] input = br.readLine().trim().split(" ");

        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
    
        System.out.println(order(n, k));
      } catch (Exception e) {
        break;
      }
    }
  }
}