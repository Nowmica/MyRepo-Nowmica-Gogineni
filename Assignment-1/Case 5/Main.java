package mypack;

public class Main
{

	public static void main(String[] args) 
	{
		
		//creating object for the class and initializing through constructor
		Main obj=new Main(20);
		
		//setting the value through object
		obj.setLength(10);
		obj.display();
	}
	
	//default constructor
	Main()
	{
		
	}
	
	//Argumented constructor
	Main(int number)
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
	public void setLength(int length) {
		this.length = length;
	}
	
	private void display()
	 {
		 System.out.println("The length,height and width is "+length+ " " +height+ " " +width);
	 }

}
