package com.hcl.domino.assig1.case2;

import java.util.InputMismatchException;

/**
 * The program is used to find the sum of squares of the number.
 * 
 * @author Nowmica
 * @version 1.8
 */
public class Main {
	public static void main(String[] args) {
		// display the usage to the user
		if (args.length == 0 || args[0].equals("-h") || args[0].equals("-help")) {
			System.out.println(
					"Usage description of the program\nThe program is used for caluclating the sum of squares\nNeed a input value to calculate the sum of sqaures\ne.g. java Main 2");
		} else {
			// Handling the exception if user does not enter a number
			try {
				// Reading the input to variable number
				int number = Integer.parseInt(args[0]);

				// printing the output by calling the static method
				System.out.println("Using Static method: " + SumOfsquares(number));

				// printing the output by calling the non static method
				Main sum = new Main();
				System.out.println("Using Non-static method: " + sum.SumOfSquares1(number));

			}
			// catching the exception
			catch (Exception e) {
				System.out.println("Invalid input");
			}
		}
	}

	/**
	 * This is the Static method used for calculating the squares. This takes an
	 * integer parameter given by the user. This method checks for negative numbers
	 * as well.
	 * 
	 * @return long
	 */
	static long SumOfsquares(int number) {
		long result = 0;

		// checking for negative number
		if (number < 0) {
			System.out.println("Number cannot be negative");
		}

		// calculating the sum of the squares for given number
		else {
			result = (number * (number + 1) * (2 * number + 1)) / 6;
		}
		return result;
	}

	/**
	 * This is the Non static method used for calculating the squares. This takes an
	 * integer parameter given by the user. This method checks for negative numbers
	 * as well.
	 * 
	 * @return long
	 */

	public long SumOfSquares1(int number) {
		long res = 0;

		// Checking for negative number
		if (number < 0) {
			System.out.println("Number cannot be negative");
		}

		else {
			res = (number * (number + 1) * (2 * number + 1)) / 6;
		}
		return res;
	}
}
