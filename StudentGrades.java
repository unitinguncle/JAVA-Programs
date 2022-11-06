package day04;

public class Student {

	private int id;
	private String name;
	private int marks1;
	private int marks2;
	private int marks3;
	static int counter = 101;
		
	public Student() {
		this.id = counter++;
	}

	public Student(String name, int marks1, int marks2, int marks3) {
		this.id = counter++;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks1() {
		return marks1;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}

	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks1=" + marks1
				+ ", marks2=" + marks2 + ", marks3=" + marks3 + "]";
	}
	
	
}


package day04;

public class Result {

	public String resultCalculator(Student student){
		double percentage = (student.getMarks1()+student.getMarks2()+student.getMarks3())/3;
		if (percentage >= 70)
			return "A";
		else if (percentage >=55)
			return "B";
		else if (percentage >= 40)
			return "C";
		else
			return "Fail";
	}
	
}


package day04;

public class StudentGrades {

	
	public static void main(String[] args) {
		Student std1 = new Student("Rahul", 89, 78,90);
		Student std2 = new Student("Shubham", 67, 55, 67);
		Student std3 = new Student("Rushikesh", 45, 49, 51);
		Student std4 = new Student("Abhishek", 34,23,12);
		
		Result res= new Result();
				
		System.out.println(std1.getName()+" "+res.resultCalculator(std1));
		System.out.println(std2.getName()+" "+res.resultCalculator(std2));
		System.out.println(std3.getName()+" "+res.resultCalculator(std3));
		System.out.println(std4.getName()+" "+res.resultCalculator(std4));
	}

}
