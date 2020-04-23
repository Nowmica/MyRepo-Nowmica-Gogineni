package com.hcl.domino.assig1;

import java.util.InputMismatchException;
/**
*The program is used to find the sum of squares of the number.
 *@author Nowmica
 *@version 1.8
 */
public class Main
{
	public static void main(String[] args) 
	{
	//display the usage to the user
	if(args.length==0)
	{
	System.out.println("Usage description of the program\nThe program is used for caluclating the sum of squares\nNeed a input value to calculate the sum of sqaures\ne.g. java Main 2");
	}
	else
	{
	//Handling the exception if user does not enter a number
	try
	{
	//Reading the input to variable number
	int number=Integer.parseInt(args[0]);
		
	//printing the output by calling the static method
	System.out.println(SumOfSquares(number));
	}
	//catching the exception 
	catch(Exception e)
	{
	System.out.println("Invalid input");
	}
	}
	}
/**
*This is the method used for calculating the squares.
*This takes an int parameter given by the user.
*This method checks for negative numbers as well.
*@return long
*/
	static long SumOfSquares(int number)
	{
		long result=0;
		
		//checking for negative number
		if(number<0)
		{
			System.out.println("Number cannot be negative\n");
		}
		
		//calculating the sum of the squares for given number
		else
		{
		 result=(number*(number+1)*(2*number+1))/6;
		}
		 return result;
	}
}
