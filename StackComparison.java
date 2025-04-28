import java.util.Scanner;
import java.util.Arrays;

class Stack {
    private int[] stackArray;
    private int top;
    private int maxSize;

    // Constructor to initialize stack with variable size
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Push method to add an element to the stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stackArray[++top] = value;
        }
    }

    // Pop method to remove an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    // Method to get all elements of the stack as an array
    public int[] getElements() {
        return Arrays.copyOf(stackArray, top + 1);
    }

    // Method to get the size of the stack
    public int getSize() {
        return top + 1;
    }
}

public class StackComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create two stack objects
        Stack stack1 = new Stack(10);
        Stack stack2 = new Stack(10);

        // Input 10 elements for stack1
        System.out.println("Enter 10 elements for Stack 1:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            int value = scanner.nextInt();
            stack1.push(value);
        }

        // Input 10 elements for stack2
        System.out.println("Enter 10 elements for Stack 2:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            int value = scanner.nextInt();
            stack2.push(value);
        }

        // Compare stack elements
        int[] elements1 = stack1.getElements();
        int[] elements2 = stack2.getElements();
        boolean areEqual = Arrays.equals(elements1, elements2);

        // Print comparison results
        System.out.println("Stack 1 Elements: " + Arrays.toString(elements1));
        System.out.println("Stack 2 Elements: " + Arrays.toString(elements2));

        if (areEqual) {
            System.out.println("The stacks are identical.");
        } else {
            System.out.println("The stacks are not identical.");
        }

        scanner.close();
    }
}
