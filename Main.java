/*
Name: Eesha Barad
PRN: 23070126161
Class: AIML - B1
Batch: 2023-27
*/

// Importing packages
import java.util.Scanner;

// Main class
class Main{
	
	//Main method which is the entry point for all java programs
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        UserInput input = new UserInput();

        while(true) {
            System.out.println("\nMenu");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Fibonacci series");
            System.out.println("6. Mean of array");
            System.out.println("7. Variance of array");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Addition
                    System.out.println("Sum is: " + calc.calculateSum(input.inputNumbers()));
                    break;
                case 2: // Subtraction
                    System.out.println("Difference is: " + calc.calculateDiff(input.inputNumbers()));
                    break;
                case 3: // Multiplication
                    System.out.println("Product is: " + calc.calculateProduct(input.inputNumbers()));
                    break;
                case 4: // Division
                    System.out.println("Quotient is: " + calc.calculateQuotient(input.inputNumbers()));
                    break;
                case 5: // Fibonacci
                    System.out.print("Enter the number of terms for Fibonacci series: ");
                    int n = scanner.nextInt();
                    calc.fibonacci(n);
                    break;
                case 6: // Mean of Array
                    System.out.println("Mean of array is: " + calc.meanOfArray(input.inputArray()));
                    break;
                case 7: // Variance of Array
                    System.out.println("Variance of array is: " + calc.varianceOfArray(input.inputArray()));
                    break;
                case 8: // Exit
                    System.out.println("Exiting the program...");
                    System.exit(0);
                    break;
                default: // Default choice if the choice of the user is invalid
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

	
	