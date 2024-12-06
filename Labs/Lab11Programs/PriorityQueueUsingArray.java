package Lab11Programs;

import java.util.ArrayList;

public class PriorityQueueUsingArray {
    private ArrayList<Integer> array; // Use ArrayList for dynamic size

    // Constructor
    public PriorityQueueUsingArray() {
        array = new ArrayList<>();
    }

    // Insert data into the array
    public void insert(int data) {
        array.add(data); // O(1)
    }

    // Extract the maximum value from the array
    public int extractMax() {
        if (array.isEmpty()) {
            throw new IllegalStateException("Priority Queue is empty");
        }
        int maxIndex = 0;
        for (int i = 1; i < array.size(); i++) { // O(n)
            if (array.get(i) > array.get(maxIndex)) {
                maxIndex = i;
            }
        }
        return array.remove(maxIndex); // Remove the maximum value
    }

    // Get the maximum value without removing it
    public int getMax() {
        if (array.isEmpty()) {
            throw new IllegalStateException("Priority Queue is empty");
        }
        int max = array.get(0);
        for (int i = 1; i < array.size(); i++) { // O(n)
            if (array.get(i) > max) {
                max = array.get(i);
            }
        }
        return max;
    }

    // Search for a specific data value in the array
    public boolean searchData(int data) {
        return array.contains(data); // O(n)
    }

    // Main method for testing
    public static void main(String[] args) {
        PriorityQueueUsingArray pq = new PriorityQueueUsingArray();

        // Test methods
        pq.insert(10);
        pq.insert(20);
        pq.insert(15);

        System.out.println("Max value: " + pq.getMax()); // Output: 20
        System.out.println("Extracted Max: " + pq.extractMax()); // Output: 20
        System.out.println("Max after extraction: " + pq.getMax()); // Output: 15
        System.out.println("Search 15: " + pq.searchData(15)); // Output: true
        System.out.println("Search 20: " + pq.searchData(20)); // Output: false
    }
}
