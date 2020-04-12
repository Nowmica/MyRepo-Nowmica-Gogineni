package mypack;

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
		System.out.println("This is overloaded constructor with integer value "+value);
	}
	
	//parameterized constructor
	Main(char[] values)
	{
		this.names=values;
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
		System.out.println("The integer value is: "+values+"\nThe character values are: ");
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);	
		}
	}
	
	public static void main(String[] args) 
	{
		char A[]= {'a','b','c','d','e'};
		Main m=new Main();
		Main m1=new Main(20);
		Main m2 =new Main(A);
		Main m3=new Main(30,A);
		m2.display();
		m3.display();
	}

}
