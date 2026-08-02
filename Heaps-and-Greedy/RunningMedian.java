
import java.util.*;

public class RunningSum {

    public int[] solve(int[] A) {
        PriorityQueue<Integer> s = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        PriorityQueue<Integer> g = new PriorityQueue<>();

        int[] res = new int[A.length];
        s.add(A[0]);
        res[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i] <= s.peek()) {
                s.add(A[i]);
            } else {
                g.add(A[i]);
            }

            int diff = s.size() - g.size();
            if (diff > 1) {
                g.add(s.poll());
            } else if (diff < 0) {
                s.add(g.poll());
            }

            res[i] = (s.peek());
        }
        return res;
    }
}
