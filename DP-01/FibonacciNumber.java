
import java.util.*;

//Calculate Nth fibonacci number using dynamic programing
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

        // S.C => O(N)
        System.out.println(fibonacci(A));

    }

    // same problem using extra space S.C => O(N)
    static int solve(int n, int[] dp) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = solve(n - 1, dp) + solve(n - 2, dp);

        return dp[n];
    }

    // Main solution function
    static int fibonacci(int n) {

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return solve(n, dp);
    }
}
