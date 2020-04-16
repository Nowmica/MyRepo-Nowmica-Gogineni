package mypack;
public class StringParsing 
{
	public static void main(String[] args) throws IOException
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
				System.out.println(args[i]+" Character  "+(Character.SIZE));
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
				System.out.println(Integer.parseInt(str) +" integer "+(Integer.SIZE));
			}
		catch(Exception ex)
			{
			try
			{
			System.out.println(Long.parseLong(str) +" long "+(Long.SIZE));
			}
			catch(Exception ex1)
			{
				try
				{
					System.out.println(Float.parseFloat(str)+" Float "+(Float.SIZE));
				}
			catch(Exception ex2)
			{
			try
			{
			System.out.println(Double.parseDouble(str)+" Double "+(Double.SIZE));
			}	
			catch(Exception e)
			{
			System.out.println("invalid input");
			}
		}
		}
	}
		}
}
