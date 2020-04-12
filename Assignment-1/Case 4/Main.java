package mypack;

public class Main 
{
	//creating a public method
	public void methodPublic()
	{
		System.out.println("This is a public method and can be accesses from anywhere");
	}
	
	//creating a protected method
	protected void methodProtected()
	{
		System.out.println("This is a protected method and can be accessed by childclass of any package");
	}
	
	//creating a default method
	void methodDefault()
	{
		System.out.println("This is a default method and can be accessed within the package");
	}
		
	//creating private method
	private void methodPrivate()
	{
		System.out.println("This is a private method and can be accessed within the class");
	}
	
	
	public static void main(String[] args)
	{
		Main Am=new Main ();
		
		//calling public method within the same class
		Am.methodPublic();
		
		//calling the private method in the same class
		Am.methodPrivate();
		
		//calling then default method in the same class 
		Am.methodDefault();
		
		//calling the protected method from subclass of the same package
		new Sample().methodProtected();
		
		//calling the default method from subclass of the same package
		new Sample().methodDefault();
		
	}
}
	

	class Sample extends Main 
	{
		
	}
	


