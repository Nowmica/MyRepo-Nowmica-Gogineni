package pack;

//importing the other package
import mypack.Main;

//Inheriting class AccessModifers
public class B extends Main
{

	public static void main(String args[]) 
	{
		//Calling public method from sub class of different package
		new B().methodPublic();
		
		//Calling protected method from sub class of different package
		new B().methodProtected();
	}
}
