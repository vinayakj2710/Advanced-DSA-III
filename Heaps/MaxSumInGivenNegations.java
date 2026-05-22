/* Given an array of integers A and an integer B. You must modify the array exactly B number of times. In a single modification, we can replace any one array element A[i] by -A[i].
You need to perform these modifications in such a way that after exactly B modifications, sum of the array must be maximum. */

public class MaxSumInGivenNegations {

    public int solve(int[] A, int B) {
        Arrays.sort(A);

        // Flip negative numbers first
        for (int i = 0; i < A.length && B > 0; i++) {
            if (A[i] < 0) {
                A[i] = -A[i];
                B--;
            }
        }

        int sum = 0;
        int minAbs = Integer.MAX_VALUE;

        // Calculate sum and minimum absolute value
        for (int num : A) {
            sum += num;
            minAbs = Math.min(minAbs, Math.abs(num));
        }

        // If B is still odd, flip smallest absolute value
        if (B % 2 == 1) {
            sum -= 2 * minAbs;
        }

        return sum;
    }
}
