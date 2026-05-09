
import java.util.*;

public class FibonacciNumber {

    public static void main(String[] args) {
        // solving using no extra space
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        if (A == 0) {
            System.out.println(0);
            return;
        }

        if (A == 1) {
            System.out.println(1);
            return;
        }

        int prev2 = 0; // f(0)
        int prev1 = 1; // f(1)
        int curr = 0;

        for (int i = 2; i <= A; i++) {
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        System.out.println(curr);

    }
}
