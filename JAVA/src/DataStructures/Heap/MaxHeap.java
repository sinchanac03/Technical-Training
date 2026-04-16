package DataStructures.Heap;

import java.util.Arrays;

public class MaxHeap {
    private int[] arr;     // Array representation of heap
    private int maxSize;   // Max size of the heap
    private int heapSize;  // Current number of elements in heap

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.heapSize = 0;
        this.arr = new int[maxSize];
    }

    // Helper functions
    private int parent(int i) { return (i - 1) / 2; }
    private int leftChild(int i) { return 2 * i + 1; }
    private int rightChild(int i) { return 2 * i + 2; }

    // Function to heapify the subtree rooted at index i
    private void heapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int largest = i;

        if (left < heapSize && arr[left] > arr[largest])
            largest = left;

        if (right < heapSize && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            swap(i, largest);
            heapify(largest);
        }
    }

    // Swap two elements in the array
    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Insert a new key into the heap
    public void insert(int key) {
        if (heapSize == maxSize) {
            System.out.println("Overflow: Could not insert key");
            return;
        }

        heapSize++;
        int i = heapSize - 1;
        arr[i] = key;

        // Heapify up
        while (i > 0 && arr[parent(i)] < arr[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    // Extract the maximum element (root) from the heap
    public int extractMax() {
        if (heapSize <= 0)
            return Integer.MIN_VALUE;

        int root = arr[0];
        arr[0] = arr[heapSize - 1];
        heapSize--;
        heapify(0);

        return root;
    }

    // Increase the value of a key at index i to newVal
    public void increaseKey(int i, int newVal) {
        arr[i] = newVal;

        // Heapify up
        while (i > 0 && arr[parent(i)] < arr[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    // Delete a key at index i
    public void deleteKey(int i) {
        increaseKey(i, Integer.MAX_VALUE);
        extractMax();
    }

    // Get the maximum element (root) of the heap
    public int getMax() {
        if (heapSize > 0)
            return arr[0];
        return Integer.MIN_VALUE;
    }

    // Get the current size of the heap
    public int size() {
        return heapSize;
    }

    // For debugging: print heap
    public void printHeap() {
        System.out.println("Heap elements: " + Arrays.toString(Arrays.copyOf(arr, heapSize)));
    }
}

class DriverCode {
    public static void main(String[] args) {
        MaxHeap h = new MaxHeap(15);

        // Insert keys into the heap
        int[] keys = {3, 10, 12, 8, 2, 14};
        for (int key : keys) {
            h.insert(key);
        }

        System.out.println("Current heap size: " + h.size());
        System.out.println("Maximum element: " + h.getMax());

        // Delete key at index 2
        h.deleteKey(2);
        System.out.println("Heap size after deletion: " + h.size());

        // Insert new keys
        h.insert(15);
        h.insert(5);
        System.out.println("Current heap size: " + h.size());
        System.out.println("Maximum element: " + h.getMax());

        // Optional: Print heap structure
        h.printHeap();
    }
}