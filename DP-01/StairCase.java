/* 
You are climbing a staircase and it takes A steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Return the number of distinct ways modulo 1000000007 
 */

public class StairCase {

    public int climbStairs(int A) {
        int mod = 1000000007;

        if (A <= 1) {
            return 1;
        }

        long prev2 = 1; // dp[0]
        long prev1 = 1; // dp[1]

        for (int i = 2; i <= A; i++) {
            long curr = (prev1 + prev2) % mod;
            prev2 = prev1;
            prev1 = curr;
        }

        return (int) prev1;
    }
}
