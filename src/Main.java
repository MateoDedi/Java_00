import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create a new Random object
        Random rand = new Random();

        // Define the maximum size of the array
        int maxSize = 20;

        // Define the upper limit for printing
        int upperLimit = 10;

        // Create a new array of integers with the maximum size
        int[] numbers = new int[maxSize];

        // Loop from 0 to maxSize (exclusive)
        for (int i = 0; i < maxSize; i++) {
            // Generate a random integer between 0 (inclusive) and 50 (exclusive)
            // and assign it to the current element of the array
            numbers[i] = rand.nextInt(50);
        }

        // Loop over each element in the array
        for (int number : numbers) {
            // If the current number is less than the upper limit
            if (number <= upperLimit) {
                // Print the number to the console
                System.out.println(number);
            }
        }
    }
}