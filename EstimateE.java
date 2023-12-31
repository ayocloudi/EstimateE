//Importing nessaary libraries
import java.util.Random;
import java.util.Scanner;

public class EstimateE {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter the number of simulations
        System.out.print("Enter the number of simulations (N): ");
        // Read the user input and store it in variable N
        int N = sc.nextInt();
        // Close the scanner to prevent memory leaks
        sc.close();

        // Create a Random object to generate random numbers
        Random random = new Random();
        // Create a variable to keep track of the total count of numbers generated across all simulations
        int count = 0;

        // Run N simulations
        for (int i = 0; i < N; i++) {
            // Initialize a sum for this simulation
            double sum = 0;
            // Initialize a variable to keep track of the count of numbers generated in this simulation
            int n = 0;
            // Keep generating random numbers and adding them to the sum until the sum exceeds 1
            while (sum < 1) {
                // Generate a random number between 0 and 1 and add it to the sum
                sum += random.nextDouble();
                // Increment the count of numbers generated
                n++;
            }
            // Add the count of numbers generated in this simulation to the total count
            count += n;
        }

        // Calculate the estimate of 'e' by dividing the total count of numbers generated by the number of simulations
        double estimate = (double) count / N;
        // Calculate the absolute error by finding the absolute difference between the estimate and the actual value of 'e'
        double absoluteError = Math.abs(estimate - Math.E);

        // Output the estimated value of 'e' and the absolute error to the console
        System.out.println("Estimated value of e: " + estimate);
        System.out.println("Absolute error: " + absoluteError);
    }
}