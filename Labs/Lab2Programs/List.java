    // a list interface

public interface List {
    
    public boolean isEmpty();
    // returns true if the list is empty, false otherwise
    
    public int size();
    // returns the number of items in the list
    
    public void addToFront(int data);
    public void addToBack(int data);
    // adds an item to the list
    // item is added at the end of the list
    
    public void addAt(int index, int data);
    // adds an item to the list at the given index
    // item is added at the given index;
    // the indices start from 1.
    public void removeAt(int index);
    public void remove(int index);
    // removes the item from the list that has the given index

    public List duplicate();

    public List duplicateReversed();    
}
