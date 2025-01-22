// Create a class for calculator operations
class Calculator{
	
	// Function to calculate sum of two numbers
	int calculateSum(int[] numbers){
		return numbers[0] + numbers[1];
	}
	
	// Function to calculate difference of two numbers
	int calculateDiff(int[] numbers){
		return numbers[0] - numbers[1];
	}
	
	// Function to calculate product of two numbers
	int calculateProduct(int[] numbers){
		return numbers[0] * numbers[1];
	}
	
	// Function to calculate quotient of two numbers
	int calculateQuotient(int[] numbers){
		if(numbers[1]==0){
			System.out.println("no div by 0");
			return 0;
		}
		return numbers[0] / numbers[1];
	}
}