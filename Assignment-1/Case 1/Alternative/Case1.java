package mypack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Case1 
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
			int count=0;
			if(count==0)
			{
				try
				{
				Integer.parseInt(str);
				System.out.println(str +" integer "+(Integer.BYTES));
				}
				catch(Exception e)
				{
					count++;
				}
				
					if(count==1)
					{
						try
						{
							Long.parseLong(str);
							System.out.println(str +" long "+(Long.BYTES));
						}
						catch(Exception e)
						{
							count++;
							if(count==2)
							{
								try
								{
									Float.parseFloat(str);
									System.out.println(str+" Float "+(Float.BYTES));
								}
								catch(Exception ex)
								{
									count++;
									if(count==3)
									{
										try
										{
									
										Double.parseDouble(str);
										System.out.println(str+" double "+(Double.BYTES));
										}
										catch(Exception exc)
										{
											System.out.println("Invalid input");
										}
									}
								}
							}
						}
					}
				}
			}
}
	
		