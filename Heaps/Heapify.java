
class Heapify {

    public int[] buildMinHeap(int[] A) {
        int n = A.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(A, n, i);
        }

        return A;
    }

    public int[] buildMaxHeap(int[] A) {
        int n = A.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(A, n, i);
        }

        return A;
    }

    // Build Min-Heap using Array
    private void heapify(int[] A, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && A[left] < A[smallest]) {
            smallest = left;
        }

        if (right < n && A[right] < A[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            int temp = A[i];
            A[i] = A[smallest];
            A[smallest] = temp;

            heapify(A, n, smallest);
        }
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
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;

            heapify(A, n, largest);
        }
    }
}
