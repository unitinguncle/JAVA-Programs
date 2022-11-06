package day04;

public class Talentsprint {

	private double basepay;
	private int hoursWorked;
	
	public Talentsprint() {
		basepay = 0 ;
		hoursWorked = 0;
	}
	
	public Talentsprint(double basepay, int hoursWorked) {
		this.basepay = basepay;
		this.hoursWorked = hoursWorked;
	}
	
	public String computeSalary() { 
		if (basepay < 8)
			return "ERROR! Basepay too LOW!";
		if (hoursWorked > 60)
			return "ERROR! Overwork!";
		else if (hoursWorked > 40){
			double wage = (40*basepay) + (hoursWorked-40)*basepay;
			return ""+wage;
		}
		else {
			double wage = (hoursWorked*basepay);
			return ""+wage;
		}
	}
	
	public static void main(String[] args) {
		Talentsprint emp1 = new Talentsprint(7.50, 35);
		Talentsprint emp2 = new Talentsprint(8.20, 47);
		Talentsprint emp3 = new Talentsprint(10, 3);
		System.out.println("Employee 1 : " + emp1.computeSalary());
		System.out.println("Employee 2 : " + emp2.computeSalary());
		System.out.println("Employee 3 : " + emp3.computeSalary());
		

	}

}
