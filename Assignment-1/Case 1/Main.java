//Program to find the datatype of the given input
package mypack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
				System.out.println(str[i]+" Character  "+(Character.SIZE));
			}
			
			//checking for number
			else
			{
			integerOrNot(str[i]);			
			}
			
		}
	}
		
	//Method to check for int data type
		static void integerOrNot(String str)
		{
			
			try
			{
				Integer.parseInt(str);
				System.out.println(str +" integer "+(Integer.SIZE));
			}
			catch(RuntimeException ex)
			{
				longOrNot(str);
			}
			
		}
	
		//Method to check for long data type
		static void longOrNot(String str)
		{
			
			try
			{
				Long.parseLong(str);
				System.out.println(str +" long "+(Long.SIZE));
			}
			catch(RuntimeException ex)
			{
				floatOrNot(str);
			}
			
		}
		
		
		//Method to check for Float data type
		static void floatOrNot(String str)
		{
			try
			{
				Float.parseFloat(str);
				System.out.println(str+" Float "+(Float.SIZE));
			}
			catch(RuntimeException ex)
			{
				doubleOrNot(str);
			}
			
		}
		
		//Method to check for double data type	
		static void doubleOrNot(String str)
		{
			try
			{
				Double.parseDouble(str);
				System.out.println(str+" double "+(Double.SIZE));
			}
			catch(RuntimeException ex)
			{
				System.out.println("invalid input");
			}
		}
}
