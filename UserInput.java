// Importing packages
import java.util.*;

// Class to get input from the user
class UserInput{

	// Function to input two numbers
	int[] inputNumbers(){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int first_number = scan.nextInt();

		System.out.println("Enter second number: ");
		int second_number = scan.nextInt();

		return new int[]{first_number,second_number};
		
	}
}
