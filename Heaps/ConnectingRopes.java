
import java.util.*;

public class ConnectingRopes {

    public int solve(int[] A) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add all ropes to heap
        for (int rope : A) {
            minHeap.add(rope);
        }

        int totalCost = 0;

        // Combine ropes until one remains
        while (minHeap.size() > 1) {
            int first = minHeap.poll();
            int second = minHeap.poll();

            int cost = first + second;
            totalCost += cost;

            minHeap.add(cost);
        }

        return totalCost;
    }
}
