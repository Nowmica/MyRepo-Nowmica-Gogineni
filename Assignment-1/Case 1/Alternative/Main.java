package com.hcl.domino.assg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 This class is created for checking the data type and size of the input  given by the user.
 The size and data type are defined by using some methods in java.lang package.
 */

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		//Reading the input from console
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the input"); 
		String string=br.readLine();
		
		//splitting the string based on space
		String str[]=string.split(" ");  
		
		for(int i=0; i<str.length;i++)
		{   
			//Retrieving the first character from the array elements
			char c=str[i].charAt(0);
			
			//checking the character for alphabet and string
			if(Character.isAlphabetic(c) && str[i].length()>1)
			{
				System.out.println(str[i]+" String "+str[i].getBytes().length);
			}
			
			//checking the alphabet for character
			else if(str[i].length()==1)
			{
				System.out.println(str[i]+" Character  "+(Character.BYTES));
			}
			
			//checking for number
			else
			{
			integerOrNot(str[i]);			
			}
			
		}
	}
		
	/* 
	This is the method used for checking for number data type i.e, int,long.
	The method takes string as a parameter and checks for the data type.
	Exceptional Handling mechanism is used to for checking the data type.
	*/
		static void integerOrNot(String str)
		{
			try
			{
				Integer.parseInt(str);
				System.out.println(str +" integer/long "+(Integer.BYTES));
			}
			catch(RuntimeException ex)
			{
				floatOrNot(str);
			}
			
		}
		
	/* 
	This is the method used for checking for floating number data type i.e, float and double.
	The method takes string as a parameter and checks for the data type.
	Exceptional Handling mechanism is used to for checking the data type.
	*/
		static void floatOrNot(String str)
		{
			try
			{
				Float.parseFloat(str);
				System.out.println(str+" Float/double "+(Float.BYTES));
			}
			catch(RuntimeException ex)
			{
				System.out.println("invalid input");
			}
			
		}
}
