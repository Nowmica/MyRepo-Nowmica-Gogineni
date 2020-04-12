package mypack;

public class Main
{
	
	// this instance variable is visible for any child class.
   	public String name;

   // The name variable is assigned in the constructor.
   	public VariableScope (String empName) 
   {
      name = empName;
   }
   	
   	@Override
   	public String toString()
   	{
		return "Name :" +name;
   		
   	}
	 public static void main(String args[]) 
	 {
		 Main empDetails = new Main("Ravi");
		 System.out.println(empDetails);
		 EmpDetails emp=new EmpDetails();
		 emp.setSalary(25000);
		 emp.setAge(25);
		 emp.printDetails();
	  }
	 
	 	
	}


	  class EmpDetails
	 {
	 
		  // visible in Employee class only.
		   private double salary;
		   
		   //visible to any sub class within or from other package
		   protected int age;
		   
		    // The salary variable is assigned a value.
		   public void setSalary(double empSal) 
		   {
		      salary = empSal;
		   }
		   
		   public void setAge(int empAge)
		   {
			   age=empAge;
		   }

		   // This method prints the employee details.
		   public void printDetails() 
		   {
			   
			  //local variable can be used within the method 
			  String empid="5123014";
			  System.out.println("Employeeid : "+ empid+ "\nSalary : " + salary+"\nAge : "+age);
		   }

		  
		}
