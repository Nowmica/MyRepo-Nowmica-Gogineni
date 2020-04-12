package mypack;

public class Main
{
	//creating two objects
	static Maind1, d2 ;	
	
	public void show( )   
	{  
		 System.out.println("Hello");  
	}
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


