
public class MinNumberOfSquares {

    // Minimum number of perfect square of a number needed to match the given integer
    public int countMinSquares(int A) {
        int[] dp = new int[A + 1];

        // Initialize with max value
        for (int i = 1; i <= A; i++) {
            dp[i] = i;
        }

        dp[0] = 0;

        for (int i = 1; i <= A; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - j * j]);
            }
        }

        return dp[A];

    }
}
