package com.hcl.domino.assg1;
/**
*This class describes the construction and destruction of objects
*/
public class Main
{
	//creating two objects
	static Main d1, d2 ;	
	
	/**
	*This method is used to print a hello statement
	@return null
	*/
	public void show( )   
	{  
		 System.out.println("Hello");  
	}
	
	/**
	*This method is used to clean an object refernces before removing it from memory.
	*This is done by garbage collector defaulty.
	@return null
	*/
	protected void finalize( ) throws Throwable   
	{
	//checking for reference
	if(d1  !=  null) 
	{
	System.out.println("d1 object is not eligible for garbage collection and is still active");
		      
	//making the reference to null
	d1 = null;
		      
	 //checking for null reference 
         if (d1 == null) 
	 System.out.println("d1 is not referenced and getting removed from memory");
	}
		 
	//checking for reference
	if(d2  !=  null) 
	{
	System.out.println("d2 object is not eligible for garbage collection and is still active");
		     
	//making the reference to null
	d2 = null;
		     
	 //checking for null reference  
	if(d2 == null) 
	System.out.println("d2 is not referenced and getting removed from memory");
	}
	super.finalize( );  
	}
	
		 public static void main( String args[])    
		 {
		System.out.println("Description of the program\nThis illustrates the construction and desctruction of object using finalize method\n"); 
		   //creating a new anonymous object for class and assigning
		   d1 = new Main(); 
   
		  //creating a new anonymous object for class and assigning
		   d2 = new Main();
		   
		   //calling the show method with object reference d1
		   d1.show();  
		   
		   //calling the show method with object reference d1
		   d2.show( );
		   
		   System.runFinalizersOnExit(true);
		 }
		}      	


