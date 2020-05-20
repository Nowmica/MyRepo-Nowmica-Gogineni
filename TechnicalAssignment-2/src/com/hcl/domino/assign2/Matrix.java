package com.hcl.domino.assign2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class performs operations for finding the sequence of repeated numbers
 * column-wise, row-wise and diagonal wise.
 */
public class Matrix {
	public static void main(String[] args) {
		//displaying the usage description of the program
		if (args.length == 0 || args[0].equals("-h") || args[0].equals("-help")) {
			System.out.println(
					"Usage description of the program\nThe program is used for checking the repetitive sequence of the numbers row-wise, column-wise and diagonal-wise. It also dispays an appropriate message if there are no such numbers found\nEnter 1 to run the program");
		} else if (args[0].equals("1")) {
			Scanner sc = new Scanner(System.in);
			try {
				// asking for number of rows
				System.out.println("Enter number of rows");
				int rows = sc.nextInt();

				// asking for number of columns
				System.out.println("Enter number of columns");
				int columns = sc.nextInt();
				if (rows == 0 || columns == 0) {
					System.out.println("Invalid size of the matix");
				} else {
					// reading the matrix values
					System.out.println("Enter the values of matrix");
					int matrix[][] = new int[rows][columns];
					int tempMatrix[][] = new int[rows][columns];
					for (int row = 0; row < rows; row++) {
						for (int column = 0; column < columns; column++) {
							matrix[row][column] = sc.nextInt();
							// checking for only 0 and 1 values
							while (!((matrix[row][column] == 0) || (matrix[row][column] == 1))) {
								System.out.println("Only 0 and 1 are accepted");
								matrix[row][column] = sc.nextInt();
							}
						}
					}
					// printing the matrix
					printMatrix(matrix);
					// storing the values in temporary matrix
					for (int row = 0; row < rows; row++) {
						for (int column = 0; column < columns; column++) {
							tempMatrix[row][column] = matrix[row][column];
						}
					}
					// option for selecting row, column or diagonal processing
					System.out.println("Select an option[1-3]");
					int option = sc.nextInt();
					sc.close();
					switch (option) {
					case 1:
						// checking for valid size of matrix for processing rows
						if (columns != 1) {
							rowProcessing(matrix, tempMatrix);
						} else {
							System.out.println("Row processing cannot be performed");
						}
						break;
					case 2:
						// checking for valid size of matrix for processing columns
						if (rows != 1) {
							columnProcessing(matrix, tempMatrix);
						} else {
							System.out.println("Column processing cannot be performed");
						}
						break;
					case 3:
						// checking for valid size of matrix for processing diagonals
						if (rows == columns) {
							diagonalProcessing(matrix, tempMatrix);
						} else {
							System.out.println("Daigonal processing cannot be performed");
						}
						break;
					default:
						System.out.println("Invalid input");
						break;

					}
				}
			} catch (InputMismatchException ime) {
				System.out.println("Invalid input");
			}
			// displaying appropriate command for help
		} else if ((!(args[0].equals("-h") || args[0].equals("-help")))) {
			System.out.println("Enter -h or -help for help");
		}
	}

	/**
	 * This method prints the elements in the matrix along with the special
	 * character *
	 * 
	 * @return null
	 */
	private static void printMatrix(int matrix[][]) {
		System.out.println("Elements of the matrix are");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[0].length; column++) {
				if (matrix[row][column] == 42) {
					System.out.print((char) matrix[row][column] + "  ");
				} else {
					System.out.print(matrix[row][column] + "  ");
				}
			}
			System.out.println();
		}

	}

	/**
	 * This method processes the row elements in the array.
	 * 
	 * @param matrix
	 * @return null
	 */
	private static void rowProcessing(int[][] matrix, int tempMatrix[][]) {
		int count = 0;
		// loop for row elements
		for (int row = 0; row < matrix.length; row++) {
			// loop for column elements
			int columns = matrix[row].length;
			for (int column = 0; column < columns - 1; column++) {
				// temporary variable indexing 1
				for (int temp = 1; temp <= columns - 1; temp++) {
					if (matrix[row][column] == matrix[row][temp] && temp != columns - 1) {
						for (int i = 1; i < columns - 1; i++) {
							matrix[row][i] = matrix[row][i + 1];
						}
						matrix[row][columns - 1] = '*';
						columns--;
						temp--;

					} else if (matrix[row][column] != matrix[row][temp]) {
						column++;
					} else {
						matrix[row][columns - 1] = '*';
						columns--;
					}
				}
			}
		}
		// checking if the matrix contains sequence of duplicate elements in the rows
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				if (matrix[row][column] == tempMatrix[row][column]) {
					count++;
				} else {
					count--;
				}
			}
		}
		if (count != matrix.length * matrix[0].length) {
			printMatrix(matrix);
		} else {
			System.out.println("There is no sequence of duplicates elements in the row");
		}
	}

	/**
	 * This method is used for processing the column elements in the matrix
	 * 
	 * @param matrix
	 * @return null
	 */
	private static void columnProcessing(int[][] matrix, int[][] tempMatrix) {
		int count = 0;
		// loop for column elements
		for (int column = 0; column < matrix[0].length; column++) {
			int rows = matrix.length - 1;
			// temporary variable indexing 1
			for (int temp = 1; temp <= rows; temp++) {
				if (matrix[temp - 1][column] == matrix[temp][column] && temp != rows) {
					for (int i = 1; i < rows; i++) {
						matrix[i][column] = matrix[i + 1][column];
					}
					matrix[rows][column] = '*';
					temp--;
					rows = rows - 1;
				} else if (matrix[temp - 1][column] == matrix[temp][column] && temp == rows) {
					matrix[temp][column] = '*';
				} else if (matrix[temp - 1][column] != matrix[temp][column]) {

				}
			}
		}
		// checking if the matrix contains sequence of duplicate elements in the columns
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				if (matrix[row][column] == tempMatrix[row][column]) {
					count++;
				} else {
					count--;
				}
			}
		}
		if (count != matrix.length * matrix[0].length) {
			printMatrix(matrix);
		} else {
			System.out.println("There is no sequence of duplicates elements in the column");
		}
	}

	/**
	 * This method is used for processing the two diagonal elements of the array
	 * 
	 * @param matrix
	 * @return null
	 */
	private static void diagonalProcessing(int[][] matrix, int tempMatrix[][]) {
		int count = 0;
		int rows = matrix.length;
		int columns = matrix[0].length;
		int array[] = new int[rows];
		int[] array1 = new int[rows];
		int tempArray[][] = new int[rows][columns];

		// creating and copying the values of matrix to temporary one
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				tempArray[row][column] = matrix[row][column];
			}
		}

		// Finding the primary diagonal of the matrix
		int index = 0;
		// copying the elements in primary diagonal to array and making the values in
		// the matrix to -1
		for (int row = 0; row < matrix.length; row++) {
			array[index] = matrix[row][row];
			matrix[row][row] = -1;
			index++;
		}
		int sizeOfArray = array.length;
		// searching for the repeated sequence of numbers in the array
		for (int indexPointer = 0; indexPointer < sizeOfArray - 1; indexPointer++) {
			if (array[indexPointer] == array[indexPointer + 1]) {
				for (int temp = 1; temp < sizeOfArray - 1; temp++) {
					array[temp] = array[temp + 1];
				}
				sizeOfArray = sizeOfArray - 1;
				array[sizeOfArray] = '*';
				indexPointer--;
			} else {

			}
		}
		// replacing the array elements back to the matrix
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				if (matrix[row][column] == -1) {
					matrix[row][column] = array[column];
				}
			}
		}

		// Finding the secondary diagonal of the matrix
		int secondIndex = 0;
		int position = rows - 1;
		int size1 = tempArray.length;
		// copying the elements in secondary diagonal to array and making the values in
		// the matrix to -1
		for (int row = 0; row < size1; row++) {
			array1[secondIndex] = tempArray[row][position];
			tempArray[row][position] = -1;
			secondIndex++;
			position--;
		}
		// searching for the repeated sequence of numbers in the array
		for (int arrayPointer = 0; arrayPointer < size1 - 1; arrayPointer++) {
			if (array1[arrayPointer] == array1[arrayPointer + 1]) {
				for (int temp = 1; temp < size1 - 1; temp++) {
					array1[temp] = array1[temp + 1];
				}
				size1 = size1 - 1;
				array1[size1] = '*';
				arrayPointer--;
			} else {

			}
		}
		// replacing the array elements back to the matrix
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < tempArray[row].length; column++) {
				if (tempArray[row][column] == -1) {
					tempArray[row][column] = array1[row];
				}
			}
		}
		// combining the obtained 2 matrices
		int rowCount = rows - 1;
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				if (row == column || matrix[row][column] == '*') {
					matrix[row][column] = matrix[row][column];
				} else if (column == rowCount || tempArray[row][column] == '*') {
					matrix[row][column] = tempArray[row][column];
					rowCount--;
				}
			}
		}
		// checking if the matrix contains sequence of duplicate elements in the
		// diagonals
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				if (matrix[row][column] == tempMatrix[row][column]) {
					count++;
				} else {
					count--;
				}
			}
		}
		if (count != matrix.length * matrix[0].length) {
			printMatrix(matrix);
		} else {
			System.out.println("There is no sequence of duplicates elements in the diagonals");
		}
	}
}
