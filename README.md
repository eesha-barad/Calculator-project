# Calculator-project
This project is a simple Java-based calculator with various functionalities, including basic arithmetic operations and additional features like Fibonacci series generation, mean and mode of an array, and variance calculation.

## Features
The program supports the following functionalities:

Addition - Calculates the sum of two numbers.

Subtraction - Finds the difference between two numbers.

Multiplication - Multiplies two numbers.

Division - Divides two numbers (handles division by zero).

Fibonacci Series - Generates the Fibonacci series up to a specified number of terms.

Mean of Array - Calculates the average (mean) of elements in an array.

Variance of Array - Calculates the variance of numbers in an array.

## Files
Main.java: Contains the main method that runs the program and calls the user input and calculator methods.

UserInput.java: A utility class to handle the user input.

Calculator.java: Contains methods to perform various mathematical operations.

## Methods
### Main.java
public static void main(String[] args): The main method, which starts the program, prompts the user for input, and calls methods to perform the necessary calculations.
### UserInput.java
int[] inputNumbers(): Prompts the user to input two integers and returns them as an array.

int[] inputArray(): Prompts the user to input the size of the array and then the array elements, returning them as an array.
### Calculator.java
int calculateSum(int[] numbers): Adds two numbers and returns the result.

int calculateDiff(int[] numbers): Subtracts the second number from the first and returns the result.

int calculateProduct(int[] numbers): Multiplies two numbers and returns the result.

int calculateQuotient(int[] numbers): Divides the first number by the second. If the second number is 0, it will print a message and return 0 to avoid division by zero errors.

void fibonacci(int n): Prints the Fibonacci series up to n terms.

int sumOfArray(int[] array): Returns the sum of all numbers in the given array.

double meanOfArray(int[] array): Calculates and returns the mean (average) of all numbers in the array.

double varianceOfArray(int[] array): Calculates and returns the variance of the numbers in the array.

## Setup
### To run the project, follow these steps:

#### 1. Clone the repository:
git clone https://github.com/eesha-barad/Calculator-project.git
#### 2. Navigate to the project directory:
cd Calculator-project
#### 3. Compile the Java files:
Make sure Java is installed on your system. Open a terminal and compile all the Java files:
javac Main.java
#### 4. Run the program:
After successfully compiling, run the program with:
java Main
### Usage
The program will prompt you to select an operation from a menu. Choose an operation, input the required values, and the program will display the result.

The available operations include addition, subtraction, multiplication, division, generating the Fibonacci series, and performing calculations with arrays (mean and variance).

### Contact
For any questions or suggestions, feel free to contact me via:
Email: eeshabarad49@gmail.com

### License
This project is open-source and free to use under the MIT License.

