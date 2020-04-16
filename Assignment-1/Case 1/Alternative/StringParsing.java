package mypack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringParsing 
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
		
	//Method to check for int data type
		static void integerOrNot(String str)
		{
			try
			{
				Integer.parseInt(str);
				System.out.println(str +" integer "+(Integer.BYTES));
			}
		
			catch(RuntimeException ex)
			{
				try
				{
				Long.parseLong(str);
				System.out.println(str +" long "+(Long.BYTES));
				}
			catch(RuntimeException e)
			{
				floatOrNot(str);
			}
			
		}
		}
		
		//Method to check for Float data type
		static void floatOrNot(String str)
		{
			try
			{
				Float.parseFloat(str);
				System.out.println(str+" Float "+(Float.BYTES));
			}
			catch(RuntimeException ex)
			{
				try
				{
				Double.parseDouble(str);
				System.out.println(str+" Double "+(Double.BYTES));
				}
				catch(Exception e)
				{
				System.out.println("invalid input");
			}
			
		}
		}
}