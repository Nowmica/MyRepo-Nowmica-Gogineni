package mypack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		
		//To read the input from user
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		//Handling the exception if user does not enter a number
		try
		{
			
		//Reading the input to variable number
		int number=sc.nextInt();
		
		//printing the output by calling the static method
		System.out.println(SumOfSquares(number));
		}
		
		//catching the exception of type InputMismatch
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input");
		}
		
	}
	
	static long SumOfSquares(int number)
	{
		long result=0;
		
		//checking for negative number
		if(number<0)
		{
			System.out.println("Number cannot be negative");
		}
		
		//calculating the sum of the squares for given number
		else
		{
		 result=(number*(number+1)*(2*number+1))/6;
		}
		 return result;
	}
}