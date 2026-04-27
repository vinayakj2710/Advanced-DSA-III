
public class AthLargestElement {

    public int[] solve(int A, int[] B) {
        int N = B.length;

        int[] ans = new int[N];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            pq.add(B[i]);

            // Keep only top A largest elements
            if (pq.size() > A) {
                pq.poll();
            }
            // If less than A elements seen
            if (pq.size() < A) {
                ans[i] = -1;
            } else {
                ans[i] = pq.peek(); // A-th largest
            }
        }
        return ans;
    }
}
