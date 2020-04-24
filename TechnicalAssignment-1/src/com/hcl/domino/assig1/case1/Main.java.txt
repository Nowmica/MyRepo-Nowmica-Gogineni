package com.hcl.domino.assig1.case1;

/**
 * This class is created for checking the data type and size of the input given
 * by the user. The size and data type are defined by using some methods in
 * java.lang package.
 * 
 * @author Nowmica
 * @version 1.8
 */
public class Main {
	public static void main(String[] args) {
		// Displaying the usage of the program to the user.
		if (args.length == 0 || args[0].equals("-h") || args[0].equals("-help")) {
			System.out.println(
					"Usage description of the program\nThe program is used for finding the datatype and size of the input\nNeed a input value to determine it\ne.g. java Main 2 dsjj .1");
		} else {
			for (int i = 0; i < args.length; i++) {
				// checking the character for alphabet and string
				if (Character.isAlphabetic(args[i].charAt(0)) && args.length > 1) {
					System.out.println(args[i] + " string " + args[0].length());
					// checking for character
				} else if (args[i].length() == 1) {
					System.out.println(args[i] + " character " + Character.SIZE);
					// checking for number
				} else {
					numberOrNot(args[i]);
				}
			}
		}
	}

	/**
	 * This is the method used for checking for number data type i.e, int,long,float
	 * and double. The method takes string as a parameter and checks for the data
	 * type. Exceptional Handling mechanism is used to for checking the data type.
	 * some methods from java.lang package are used for converting the string to the
	 * primitive data types.
	 * 
	 * @return null
	 */
	private static void numberOrNot(String string) {
		// TODO Auto-generated method stub
		try {
			// checking for integer data type
			Integer i = new Integer(string).intValue();
			System.out.println(string + " integer " + Integer.SIZE);
		} catch (Exception e) {
			try {
				// checking for Long data type
				Long l = new Long(string).longValue();
				System.out.println(string + " long " + Long.SIZE);
			} catch (Exception e1) {
				try {
					// checking for float data type
					Float f = new Float(string).floatValue();
					System.out.println(string + " float " + Float.SIZE);
				} catch (Exception e2) {
					try {
						// checking for double data type
						Double d = new Double(string).doubleValue();
						System.out.println(string + " double " + Double.SIZE);
					} catch (Exception e3) {
						System.out.println(string + " string " + string.length());
					}
				}
			}

		}
	}
}
