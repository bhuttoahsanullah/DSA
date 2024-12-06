package Lab8Programs;
import java.util.Scanner;

public class UndoRedo {

    Scanner cin = new Scanner(System.in);

    StackInLinkedList undo = new StackInLinkedList();
    StackInLinkedList redo = new StackInLinkedList();
    StackInLinkedList stack = new StackInLinkedList();

    public void undoRedoProgram(int choice) {

        if (choice == 1) {
            System.out.print("Choice 1: input ");
            String inp = cin.nextLine();
            stack.push(inp);
            redo.clear(); // Clear redo stack when new input is added
            System.out.println("Inserted: " + inp);

        } else if (choice == 2) {
            if (!stack.isEmpty()) {
                undo.push(stack.pop());
                System.out.println("Undo Successful ");
            } else {
                System.out.println("Nothing to undo");
            }

        } else if (choice == 3) {
            if (!redo.isEmpty()) {
                stack.push(redo.pop());
                System.out.println("Redo Successful ");
            } else {
                System.out.println("Nothing to redo");
            }

        } else if (choice == 4) {
            stack.printStack();
            System.out.println("\nThanks For Using this ");
        } else {
            System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        UndoRedo u = new UndoRedo();

        while (true) {
            System.out.print("Enter Your Choice (1 for insert, 2 for undo, 3 for redo, 4 to display, 0 to exit): ");
            int choice = cin.nextInt();
            cin.nextLine(); // Consume the newline

            if (choice == 0) {
                System.out.println("Exiting program.");
                break;
            }

            u.undoRedoProgram(choice);
        }
        cin.close();
    }
}
