import java.util.ArrayList;

// Define a generic stack class
class CustomStack<E> {

    // Internal list to store elements
    private ArrayList<E> elements = new ArrayList<>();

    // Size of the stack
    public int getSize() {
        return elements.size();
    }

    // Return top element of the stack
    public E peek() {
        return elements.get(getSize() - 1);
    }

    public void push(E item) {
        elements.add(item);
    }

    // Pop and return the top element from the stack
    public E pop() {
        E item = elements.get(getSize() - 1);
        elements.remove(getSize() - 1);
        return item;
    }

    // Check if its empty
    public boolean isEmpty() {
        return elements.isEmpty();
    }
    @Override
    public String toString() {
        return "Stack: " + elements.toString();
    }
}

// Define a class 
public class PrimeNumberFinder {

    // Method to check for prime numbers
    public static boolean isPrime(int number) {
        boolean isPrime = number > 1;
        for (int i = 2; i < number; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return isPrime;
    }

    // Main method to find and print prime numbers
    public static void main(String[] args) {
        CustomStack<Integer> primeStack = new CustomStack<>();
        int count = 0;
        int num = 2;
        while (count < 50) {
            if (isPrime(num)) {
                primeStack.push(num);
                count++;
            }
            num++;
        }
        System.out.print("Prime numbers are:");
        while (!primeStack.isEmpty()) {
            System.out.print(" " + primeStack.pop());
        }
        System.out.println();
    }
}