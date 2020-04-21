package com.hcl.domino.assig1;

/**
 * This program illustrates the different ways of initializing the private member variables
 */
public class PrivateMem 
{

	public static void main(String[] args) 
	{
		if(args.length==0)
		{
		System.out.println("Usage description of the program\nThe program is used for displaying the length,width and height of a triangle\nNeed a input value to display\ne.g. java Main 2 5");
		}
		else
		{
		try
		{
		//creating object for the class and initializing through constructor
		PrivateMem obj=new PrivateMem(Integer.parseInt(args[0]));
		//setting the value through object
		obj.setLength(Integer.parseInt(args[1]));
		obj.display();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input");
		}
		
	}
	}
	
	/**
	 * This is a default constructor
	 */
	PrivateMem()
	{
		
	}
	
	/**
	 * This is a parameterized constructor
	 * @param number
	 */
	PrivateMem(int number)
	{
		this.height=number;
	}
	
	//generating setter and getter method and initializing by setting value
	private int length;
	
	//Initializing by creating constructor
	private int height;
	
	// Declaring and Initializing
	private int width=30;
	
	//Setter and getter methods
	 public int getLength() {
		return length;
	}
	 
	 /**
	    * This is a setter method which is used to set the value of length
	    * @param lenght
	    * @return null
	    */
	public void setLength(int length) {
		this.length = length;
	}
	
	/**
	    * This is the display method which is used to display the values of length,width,height
	    * @return null
	    */
	private void display()
	 {
		 System.out.println("The length,height and width is "+length+ " " +height+ " " +width);
	 }

}
