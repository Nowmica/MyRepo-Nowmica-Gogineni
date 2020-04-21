package mypack;
public class Main 
{
	public static void main(String[] args) 
	{
		for(int i=0; i<args.length;i++)
		{   
			//Retrieving the first character from the array elements
			char c=args[i].charAt(0);
			
			//checking the character for alphabet and string
			if(Character.isAlphabetic(c) && args[i].length()>1)
			{
				System.out.println(args[i]+" String "+args[i].getBytes().length);
			}
			
			//checking the alphabet for character
			else if(args[i].length()==1)
			{
				System.out.println(args[i]+" Character  "+(Character.BYTES));
			}
			
			//checking for number
			else
			{
			NumberOrNot(args[i]);			
			}
			
		}
	}
		
	//Method to check for number data type
		static void NumberOrNot(String str)
		{
			try
			{
				System.out.println(Integer.parseInt(str) +" integer "+(Integer.BYTES));
			}
		catch(Exception ex)
			{
			try
			{
			System.out.println(Long.parseLong(str) +" long "+(Long.BYTES));
			}
			catch(Exception ex1)
			{
				try
				{
					System.out.println(Float.parseFloat(str)+" Float "+(Float.BYTES));
				}
			catch(Exception ex2)
			{
			try
			{
			System.out.println(Double.parseDouble(str)+" Double "+(Double.BYTES));
			}	
			catch(Exception e)
			{
			System.out.println(e);
			}
		}
		}
	}
		}
}
