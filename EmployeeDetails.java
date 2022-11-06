package day05;

public class PartTimeEmployee extends Employee{
	protected int hoursWorked;
	protected double amountPerHour;
	
	public PartTimeEmployee() {
	}
	
	public PartTimeEmployee(String firstName, String lastName, String address, int hoursWorked, double amountPerHour) {
		super(firstName, lastName, address);
		this.amountPerHour = amountPerHour;
		this.hoursWorked = hoursWorked;
		// TODO Auto-generated constructor stub
	}
	
	public double computeSal() {
		double salary = amountPerHour * hoursWorked;
		return salary;
	}
	
	public void showDetails() { 
		System.out.println("Employee Id : " + this.id);
		System.out.println("Employee Name : " + getFullName());
		System.out.println("Hours worked : " + this.hoursWorked);
		System.out.println("Amount Per Hours : " + this.amountPerHour);
		System.out.println("\nSalary : " + computeSal()+  "\n");

	}
	
}

package day05;

public class FullTimeEmployee extends Employee{
	protected int basic;
	protected int bonus;
	
	public FullTimeEmployee() {
	}
	
	public FullTimeEmployee(String firstName, String lastName, String address, int basic, int bonus) {
		super(firstName, lastName, address);
		this.basic = basic;
		this.bonus = bonus;		
	}
	
	public double computeSal() {
		double salary = basic + bonus;
		return salary;
	}
	
	public void showDetails() { 
		System.out.println("Employee Id : " + this.id);
		System.out.println("Employee Name : " + getFullName());
		System.out.println("Basic Salary : " + this.basic);
		System.out.println("Bonus Salary : " + this.bonus);
		System.out.println("\nSalary : " + computeSal()+  "\n");

	}
}

package day05;

public class Employee {
	protected int id;
	protected String firstName;
	protected String lastName;
	protected String address;
	
	static int count = 1001;
	public Employee() {
		this.id = count++;
	}

	public Employee(String firstName, String lastName, String address) {
		super();
		this.id = count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public String getFullName() { 
		return (this.firstName + " " + this.lastName);
	}
}

package day05;

public class EmployeeDetails {

	
	public static void main(String[] args) {
		FullTimeEmployee emp1 = new FullTimeEmployee("Shiva", "Karan", "CHN",15000, 5000);
		emp1.showDetails();
		PartTimeEmployee emp2 = new PartTimeEmployee("Rakesh", "Sharma", "HYD", 200, 50);
		emp2.showDetails();

	}

}
