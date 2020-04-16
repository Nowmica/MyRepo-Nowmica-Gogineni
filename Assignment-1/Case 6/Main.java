
package mypack;

import java.util.Arrays;

public class Main 
{
	//declaring the variables
	private int values;
	private char[] names=new char[20] ;	
	
	//default constructor
	Main()
	{
		System.out.println("This is default constructor");
	}
	
	//parameterized constructor 
	Main(int value)
	{
		this.values=value;
		System.out.println("This is overloaded constructor with integer value ");
	}
	
	//parameterized constructor
	Main(char[] values)
	{
		names = new char[values.length]; 
        for (int i = 0; i < names.length; i++) 
        { 
        	names[i] = values[i]; 
        }
		System.out.println("This is overloaded constructor with character value ");
	}
	
	//parameterized constructor
	Main(int value, char[] values)
	{
		this.names=values;
		this.values=value;
		System.out.println("This is overloaded constructor with integer,character values");	
	}
	
	public void display()
	{
		System.out.println("The integer value is: "+values+"\nThe character values are: "+Arrays.toString(names));
	}
	
	public static void main(String[] args) 
	{
		char A[]= {'a','b','c','d','e'};
		
		Main m=new Main();
		
		Main m1=new Main(20);
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

}
