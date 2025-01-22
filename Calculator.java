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
	
	// Function to calculate fibonacci series of a number
	void fibonacci(int n){
		if(n<=0){
			System.out.println("Number of terms > than 0");
			return;
		}
		System.out.println("Fibonacci series up to "+n+ " terms: ");
		int a = 0, b=1;
		for(int i=1; i<=n;i++){
			System.out.print(a + " ");
			int next = a+b;
			a = b;
			b = next;
		}
		System.out.println();
	}
	
	// Function to calculate sum of an array
	int sumOfArray(int[] array){
		int sum = 0;
		for(int num : array){
			sum += num;
		}
		return sum;
	}

	// Function to calculate mean of an array
	double meanOfArray(int[] array){
		if (array.length == 0){
			System.out.println("Array is empty");
			return 0;
		}
		return (double) sumOfArray(array) / array.length;
	
	}
	
	// Function to calculate variance of an array
	double varianceOfArray(int[] array) {
		if (array.length == 0) {
			System.out.println("Array is empty");
			return 0;
		}
		double mean = meanOfArray(array);
		double sumSquaredDifferences = 0;
		for (int num : array) {
			sumSquaredDifferences += Math.pow(num - mean, 2);
		}
		return sumSquaredDifferences / array.length;
	}
}