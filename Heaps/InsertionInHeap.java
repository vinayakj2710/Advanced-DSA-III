
import java.util.*;

class InsertionInHeap {

    public static ArrayList<Integer> insertion(ArrayList<Integer> A, int K) {
        ArrayList<Integer> heap = new ArrayList<>(A);
        heap.add(K);

        int i = heap.size() - 1;

        while (i > 0) {
            int p = (i - 1) / 2;
            if (heap.get(i) >= heap.get(p)) {
                break;
            }
            swap(heap, i, p);
            i = p;
        }
        return heap;
    }

    private static void swap(ArrayList<Integer> heap, int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public static void main(String args[]) {
        System.out.println("Insertion in Heap");
    }
}
