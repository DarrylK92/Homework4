import java.util.Scanner;

/**
 * Homework4 - 6.5: Sorts 3 numbers provided by user in ascending order
 * 
 * CIS2571-001
 * @author Darryl Karney
 * @version 21Jun2018
 */

public class ThreeNumberSort {

	public static void main(String[] args) {
		//Declare variables
		Scanner scanner = new Scanner(System.in);
		double num1, num2, num3;
		
		//Get user input
		System.out.println("Enter the first number: ");
		num1 = scanner.nextDouble();
		System.out.println("Enter the second number: ");
		num2 = scanner.nextDouble();
		System.out.println("Enter the third number: ");
		num3 = scanner.nextDouble();
		
		//Run method
		displaySortedNumbers(num1, num2, num3);
	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		//Declare variables
		double smallest, middle, biggest;
		
		//Display smallest number
		if (num1 <= num2 && num1 <= num3) {
			smallest = num1;
		} else if (num2 <= num1 && num2 <= num3) {
			smallest = num2;
		} else {
			smallest = num3;
		}
		System.out.println("Smallest number: " + smallest);
		
		//Display middle number
		if ((num1 >= num2 && num1 <= num3) || (num1 >= num3 && num1 <= num2)) {
			middle = num1;
		} else if ((num2 >= num1 && num2 <= num3) || (num2 >= num3 && num2 <= num1)) {
			middle = num2;
		} else {
			middle = num3;
		}
		System.out.println("Middle number: " + middle);
		
		//Display biggest number
		if (num1 >= num2 && num1 >= num3) {
			biggest = num1;
		} else if (num2 >= num1 && num2 >= num3) {
			biggest = num2;
		} else {
			biggest = num3;
		}
		System.out.println("Biggest number: " + biggest);
	}

}
