import java.util.Scanner;

public class stackArray {

    private int maxSize;
    private int top;
    private int[] stackArray;

    public stackArray(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full");
        } else {
            stackArray[++top] = value;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        stackArray stack = new stackArray(5);
        boolean exit = false;

        while (!exit) {
            System.out.println("Choose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if empty");
            System.out.println("5. Check if full");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter value to push:");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    System.out.println("Popped value: " + stack.pop());
                    break;
                case 3:
                    System.out.println("Top value: " + stack.peek());
                    break;
                case 4:
                    System.out.println("Is stack empty? " + stack.isEmpty());
                    break;
                case 5:
                    System.out.println("Is stack full? " + stack.isFull());
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}