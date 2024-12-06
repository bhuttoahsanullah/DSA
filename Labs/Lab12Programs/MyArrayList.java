package Lab12Programs;

public class MyArrayList {

    public static int[] asArray;
    public static int count, size;
    // @SuppressWarnings("unchecked")

    public MyArrayList() {
        asArray = new int[1];
        count = 0;
        size = 1;
    }

    // Appends the element to the end of the list
    public static void add(int data) {
        if (count == size) {
            growSize();
        }
        asArray[count] = data;
        count++;
    }

    // Inserts the new element into specified by an index position
    // shifting elements after the index toward the end of a list
    public static void addAt(int index, int data) {
        if (count == size) {
            growSize();
        }

        for (int i = count - 1; i >= index; i--) {
            asArray[i + 1] = asArray[i];
        }

        asArray[index] = data;
        count++;
    }

    // function makes size double of array
    public static void growSize() {

        int temp[] = null;
        if (count == size) {
            // temp is a double size array of array
            // and store array elements
            temp = new int[size * 2];

            for (int i = 0; i < size; i++) {
                // copy all array value into temp
                temp[i] = asArray[i];
            }
        }

        // double size array temp initialize
        // into variable array again
        asArray = temp;
        // and make size is double also of array
        size = size * 2;
    }

    public static void shrinkSize() {
        int temp[] = null;
        if (count > 0) {
            temp = new int[count];
            for (int i = 0; i < size; i++) {
                temp[i] = asArray[i];
            }

            size = count;
            asArray = temp;
        }
    }

    // delete last element
    public static void delete() {
        if (count > 0) {
            asArray[count - 1] = 0;
            count--;
        }
    }

    // Removes the element from the position specified by the index
    // shifting elements after the index toward the beginning of a list
    public static void deleteAt(int index) {
        if (count > 0) {
            for (int i = index; i < count - 1; i++) {
                asArray[i] = asArray[i + 1];
            }
            asArray[count - 1] = 0;
            count--;
        }
    }

    // Returns quantity of elements in the list
    public static int size() {
        return count;
    }

    // Checks if a list has an elements
    public static boolean isEmpty() {
        return count == 0;
    }

    // Checks if the list has a specified value
    public static boolean contains(int data) {
        if (!isEmpty()) {
            for (int i = 0; i < count; i++) {
                if (asArray[i] == data) {
                    return true;
                }
            }
        }
        return false;
    }

    // Replaces the element of the list specified by the index position
    // with a new element
    public static void set(int index, int data) {
        if (!isEmpty()) {
            for (int i = 0; i < count; i++) {
                if (i == index) {
                    asArray[index] = data;
                }
            }
        }
    }

    // Returns the element from the position specified by the index
    public static int get(int index) {
        if (!isEmpty()) {
            for (int i = 0; i < count; i++) {
                if (i == index) {
                    return asArray[index];
                }
            }
        }
        return -1;
    }

    public static void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty");
        }
        if (!isEmpty()) {
            for (int i = 0; i < count; i++) {
                System.out.print(asArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();

        System.out.println("IsEmpty : " + isEmpty());
        add(2);
        add(3);
        add(4);
        add(5);
        System.out.println("Print List : ");
        printList();
        System.out.println();

        System.out.println("IsEmpty : " + isEmpty());
        System.out.println();
        addAt(2, 7);
        System.out.println("Print List : ");
        printList();
        System.out.println();

        delete();
        System.out.println("Print List : ");
        printList();
        System.out.println();

        deleteAt(2);
        System.out.println("Print List : ");
        printList();
        System.out.println();

        System.out.println("Size Method : " + size());
        System.out.println("count Variable : " + count);
        System.out.println("Size Variable : " + size);

        System.out.println("Contains : "+contains(3));
        System.out.println("Contains : "+contains(7));

        set(1, 5);
        System.out.println("Print List : ");
        printList();
        System.out.println();

        System.out.println("Get : "+get(1));
        
    }
}