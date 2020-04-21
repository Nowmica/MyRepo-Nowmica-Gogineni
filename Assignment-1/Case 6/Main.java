package com.hcl.domino.assig1;

import java.util.Arrays;
/**
*This class illustatrates the shallow and deep copy of the object and constructor overloading.
*/

public class Main 
{
	//declaring the variables
	private int values;
	private char[] names=new char[20] ;	
	
	/**
	*This is the default constructor
	*/
	Main()
	{
		System.out.println("This is default constructor");
	}
	
	/**
	*This is the Parameterized constructor
	@param value
	*/
	Main(int value)
	{
		this.values=value;
		System.out.println("This is overloaded constructor with integer value ");
	}
	
	/**
	*This is the Parameterized constructor
	@param values
	*/
	Main(char[] values)
	{
		names = new char[values.length]; 
        for (int i = 0; i < names.length; i++) 
        { 
        	names[i] = values[i]; 
        }
		System.out.println("This is overloaded constructor with character value ");
	}
	
	/**
	*This is the Parameterized constructor
	*@param value ,values
	*/
	Main(int value, char[] values)
	{
		this.names=values;
		this.values=value;
		System.out.println("This is overloaded constructor with integer,character values");	
	}
	
	/**
	*This is a method which is used to display the integer and character values
	*@return null
	*/
	public void display()
	{
		System.out.println("The integer value is: "+values+"\nThe character values are: "+Arrays.toString(names));
	}
	
	public static void main(String[] args) 
	{
		if(args.length==0)
		{
		System.out.println("Usage description of the program\nThe program is used for displaying the values\nNeed input value to display\ne.g. java Main 2");
		}
		else
		{
		char A[]= {'a','b','c','d','e'};
		
		Main m=new Main();
		try
		{
		Main m1=new Main(Integer.parseInt(args[0]));
		m1.names=A;
		m1.display();
		
		//deep copying
		System.out.println("Deep copy");
		Main m2 =new Main(A);
		m2.values=10;
		m2.display();
		A[0]='s';
		m2.display(); 
		
		//shallow copying
		System.out.println("Shallow copy");
		Main m3=new Main(30,A);
		m3.display();
		}
			catch(exception e)
			{
				System.out.println("Invalid input");
			}
	}

}
