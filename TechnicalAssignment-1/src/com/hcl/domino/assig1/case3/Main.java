package com.hcl.domino.assig1.case3;

/**
 * This class defines the usage of variable scope,access modifiers
 * 
 * @author Nowmica
 * @version 1.8
 */
public class Main {
	// class variable is visible for any child class.
	public String name;

	// class variable visible in this class only.
	private double salary;

	// class variable visible to any sub class within or from other package
	protected int age;

	/**
	 * This is a setter method which is used to set the value of Name
	 * 
	 * @param empName
	 * @return null
	 */
	public void setName(String empName) {
		name = empName;
	}

	/**
	 * This is a setter method which is used to set the value of salary
	 * 
	 * @param empSal
	 * @return null
	 */
	public void setSalary(double empSal) {
		salary = empSal;
	}

	/**
	 * This is a setter method which is used to set the value of Age
	 * 
	 * @param empAge
	 * @return null
	 */
	public void setAge(int empAge) {
		age = empAge;
	}

	/**
	 * This method is used to print the details of the employee. It also explains
	 * the usage of local variable.
	 * 
	 * @return null
	 */
	public void printDetails() {
		// local variable can be used within the method
		String empid = "5123014";
		System.out.println("Name : " + name + "\nEmployeeid : " + empid + "\nSalary : " + salary + "\nAge : " + age);
	}

	public static void main(String args[]) {
		// display the usage to the user
		if (args.length == 0 || args[0].equals("-h") || args[0].equals("-help")) {
			System.out.println(
					"Usage description of the program\nThe program is used for displaying the employeedetails using variable scope and accessmodifiers\nNeed a input value to display the details\ne.g. java Main Ravi 45000 45\n i.e, java Main <String> <double> <int>");
		} else {
			try {
				EmpDetails ed = new EmpDetails();
				ed.setName(args[0]);
				ed.setSalary(Double.parseDouble(args[1]));
				ed.setAge(Integer.parseInt(args[2]));
				ed.printDetails();
				ed.display();
			} catch (Exception e) {
				System.out.println("Invalid input");
			}
		}
	}
}

/**
 * This is sub class which extends the super class Main
 */
class EmpDetails extends Main {
	// class variable
	public String role = "Musician";

	/**
	 * This method is used to display the employee Work details. It also shows the
	 * access of public and protected variables name,age from the super class
	 * 
	 * @return null
	 */
	public void display() {
		System.out.println("Working details\nName : " + name + "\nRole : " + role + "\nAge :" + age);
	}
}
