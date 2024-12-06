package Lab11Programs;
import java.util.ArrayList;

public class PriorityQueueUsingHeap {
    private ArrayList<Integer> heap;

    // Constructor
    public PriorityQueueUsingHeap() {
        heap = new ArrayList<>();
    }

    // Get the index of the parent of a node
    private int parent(int index) {
        return (index - 1) / 2;
    }

    // Get the index of the left child of a node
    private int leftChild(int index) {
        return (2 * index) + 1;
    }

    // Get the index of the right child of a node
    private int rightChild(int index) {
        return (2 * index) + 2;
    }

    // Insert a new value into the heap
    public void insert(int data) {
        heap.add(data); // Add the element at the end
        int current = heap.size() - 1;

        // Heapify up: Ensure the heap property is maintained
        while (current > 0 && heap.get(current) > heap.get(parent(current))) {
            // Swap the current node with its parent
            int temp = heap.get(current);
            heap.set(current, heap.get(parent(current)));
            heap.set(parent(current), temp);

            // Move up to the parent
            current = parent(current);
        }
    }

    // Extract the maximum value (root) from the heap
    public int extractMax() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Priority Queue is empty");
        }

        int max = heap.get(0); // The root is the maximum element
        int lastElement = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, lastElement); // Move the last element to the root
            heapifyDown(0); // Restore the heap property
        }

        return max;
    }

    // Restore the heap property by heapifying down
    private void heapifyDown(int index) {
        int largest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        // Find the largest among the node, left child, and right child
        if (left < heap.size() && heap.get(left) > heap.get(largest)) {
            largest = left;
        }
        if (right < heap.size() && heap.get(right) > heap.get(largest)) {
            largest = right;
        }

        // If the largest is not the current node, swap and continue heapifying
        if (largest != index) {
            int temp = heap.get(index);
            heap.set(index, heap.get(largest));
            heap.set(largest, temp);

            heapifyDown(largest);
        }
    }

    // Get the maximum value without removing it
    public int getMax() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Priority Queue is empty");
        }
        return heap.get(0); // The root is the maximum element
    }

    // Check if the heap is empty
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    // Main method for testing
    public static void main(String[] args) {
        PriorityQueueUsingHeap pq = new PriorityQueueUsingHeap();

        // Insert elements
        pq.insert(10);
        pq.insert(20);
        pq.insert(15);
        pq.insert(30);
        pq.insert(25);

        // Test methods
        System.out.println("Max value: " + pq.getMax()); // Output: 30
        System.out.println("Extracted Max: " + pq.extractMax()); // Output: 30
        System.out.println("Max after extraction: " + pq.getMax()); // Output: 25
        pq.insert(40);
        System.out.println("Max after inserting 40: " + pq.getMax()); // Output: 40
    }
}
