import java.util.Scanner;

public class Parameterized {

    static void calculateSum(int i, int n, int currentSum) {
        if (i > n) {
            System.out.println("The sum of numbers from 1 to " + n + " is: " + currentSum);
            return;
        }
        calculateSum(i + 1, n, currentSum + i);  // Recursive call
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner for input
        System.out.println("Enter your number:");
        int n = scanner.nextInt();

        calculateSum(1, n, 0);  // Start the calculation with i = 1, sum = 0
        scanner.close();  // Close the scanner
    }
}
