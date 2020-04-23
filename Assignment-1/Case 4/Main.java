package com.hcl.domino.assig1;

import com.hcl.domino.sub.assign1.Sub;
/**
*This class illustrates the difference between public, private and protected access specifiers
*/
public class Main 
{
	/**
	*This is a public method which can be accessed from anywhere.
	@return null
	*/
	public void methodPublic()
	{
	System.out.println("This is a public method and can be accesses from anywhere");
	}
	
	/**
	*This is a protected method which can be accessed from sub class.
	@return null
	*/
	protected void methodProtected()
	{
		System.out.println("This is a protected method and can be accessed by childclass of any package");
	}
	
	/**
	*This is a default method which can be accessed within the package.
	@return null
	*/
	void methodDefault()
	{
		System.out.println("This is a default method and can be accessed within the package");
	}
		
	/**
	*This is a private method which can be accessed within the class.
	@return null
	*/
	private void methodPrivate()
	{
		System.out.println("This is a private method and can be accessed within the class");
	}
	
	
	public static void main(String[] args)
	{
	  System.out.println("Usage description of the program\nThe program is used illustrate the access modifiers\n");
	  Main Am=new Main ();
	  System.out.println("In the same class");
	
	//calling public method within the same class
	Am.methodPublic();
		
	//calling the private method in the same class
	Am.methodPrivate();
		
	//calling then default method in the same class 
	Am.methodDefault();
		
	System.out.println("\nIn the sub class class within same package");	
	//calling the public method from subclass of the same package
	new Sample().methodPublic();	
		
	//calling the protected method from subclass of the same package
	new Sample().methodProtected();
		
	//calling the default method from subclass of the same package
	new Sample().methodDefault();
		
	System.out.println("\nIn the sub class of different package");
	//Calling public method from sub class of different package
	new Sub().methodPublic();
		
	//Calling protected method from sub class of different package
	new Sub().methodProtected();
	}
}
	
/**
*This the sub class which extends the super class Main within the same package
*/
	class Sample extends Main 
	{
		
	}
	


