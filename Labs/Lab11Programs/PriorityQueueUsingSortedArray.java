package Lab11Programs;

import java.util.ArrayList;

public class PriorityQueueUsingSortedArray {
    private ArrayList<Integer> array; // Use ArrayList for dynamic size

    // Constructor
    public PriorityQueueUsingSortedArray() {
        array = new ArrayList<>();
    }

    // Insert data into the array in sorted order
    public void insert(int data) {
        if (array.isEmpty()) {
            array.add(data); // Add the first element if the array is empty
        } else {
            int i = 0;
            // Find the correct position to insert the element
            while (i < array.size() && array.get(i) < data) {
                i++;
            }
            array.add(i, data); // Insert the element at the correct position (O(n))
        }
    }

    // Extract the maximum value from the array (last element)
    public int extractMax() {
        if (array.isEmpty()) {
            throw new IllegalStateException("Priority Queue is empty");
        }
        return array.remove(array.size() - 1); // Remove the last element (O(1))
    }

    // Get the maximum value without removing it
    public int getMax() {
        if (array.isEmpty()) {
            throw new IllegalStateException("Priority Queue is empty");
        }
        return array.get(array.size() - 1); // Return the last element (O(1))
    }

    // Search for a specific data value in the array
    public boolean searchData(int data) {
        return array.contains(data); // O(n)
    }

    // Main method for testing
    public static void main(String[] args) {
        PriorityQueueUsingSortedArray pq = new PriorityQueueUsingSortedArray();

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
