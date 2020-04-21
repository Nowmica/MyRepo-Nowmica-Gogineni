package com.hcl.domino.assign1;

/*
 This class is created for checking the data type and size of the input  given by the user.
 The size and data type are defined by using some methods in java.lang package.
 */
public class Main 
{	
public static void main(String[] args) 
{
	
//Displaying the usage of the program to the user.	
if(args.length==0)
{
System.out.println("Usage description of the program\n\nThe program is used for finding the datatype and size of the input\nNeed a input value to determine it\ne.g. java Main 2 dsjj .1");
}
else
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
}		
/* 
This is the method used for checking for number data type i.e, int,long,float and double.
The method takes string as a parameter and checks for the data type.
Exceptional Handling mechanism is used for checking the data type.
some methods from java.lang package are used for converting the string to the primitive data type i.e, Integer.parseInt()
 */
static void NumberOrNot(String str)
{
try
{
	
//checking for integer data type
System.out.println(Integer.parseInt(str) +" integer "+(Integer.BYTES));
}
catch(Exception ex)
{
try
{
	
//checking for Long data type
System.out.println(Long.parseLong(str) +" long "+(Long.BYTES));
}
catch(Exception ex1)
{
try
{
	
//checking for float data type
System.out.println(Float.parseFloat(str)+" Float "+(Float.BYTES));
}
catch(Exception ex2)
{
try
{

//checking for double data type
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
