
import java.util.*;

class HeapSort {

    // Build Min-Heap using Array
    private int[] heapSort(int[] A) {
        int N = A.length;
        // max heapify
        for (int i = (N / 2) - 1; i >= 0; i--) {
            maxHeapify(A, N, i);
        }
        int j = N - 1;
        while (j > 0) {
            swap(A, 0, j);
            maxHeapify(A, j, 0);
            j--;
        }
        return A;
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    // Build Max-Heap using Array
    private void maxHeapify(int[] A, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && A[left] > A[largest]) {
            largest = left;
        }

        if (right < n && A[right] > A[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(A, i, largest);

            maxHeapify(A, n, largest);
        }
    }
}
