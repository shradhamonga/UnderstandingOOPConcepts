package oOPs;

class NewEmployee{
	String name;
	int employeeId;
	int baseSalary;
	
	
	NewEmployee(String name, int employeeId){
		this.name = name;
		this.employeeId = employeeId;
	}
	
	NewEmployee(String name, int employeeId, int baseSalary ){
		this.name = name;
		this.employeeId = employeeId;
		this.baseSalary = baseSalary;	
	}
	
	void calculateSalary() {
		System.out.println("Base Salary"+baseSalary);
	}
	void displayDetails() {
		System.out.println("Employee details are as follows: Employee Name :"+name+"\n Employee ID: "+employeeId+"\n Salary:"+baseSalary);
	}
}

class FullTimeEmployee extends NewEmployee{
	int bonus;
	
	FullTimeEmployee(String name, int i, int j, int bonus){
		super(name,i,j);
		this.bonus = bonus;
	}
	
	void calculateSalary() {
		System.out.println("Base Salary along with bonus is "+(baseSalary+bonus));
	}
	void displayDetails() {
		System.out.println("Employee details are as follows: Employee Name:"+name+"\n Employee ID: "+employeeId+"\n Salary:"+(baseSalary+bonus));
	}
}

class PartTimeEmployee extends NewEmployee{
	int hoursWorked;
	int hourlyRate;
	
	PartTimeEmployee(String name, int employeeId, int hoursWorked, int hourlyRate){
		super(name, employeeId);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	void calculateSalary() {
		System.out.println("Base Salary for PartTimeEmployee is "+(hoursWorked*hourlyRate));
	}
	void displayDetails() {
		System.out.println("Employee details  for Part Time employees are as follows: Employee Name:"+name+"\n Employee ID: "+employeeId+"\n Salary:"+(hoursWorked*hourlyRate));
	}
	
}

class Intern extends NewEmployee{
	
	int stipend;
	
	Intern(String name, int employeeId, int stipend){
		super(name, employeeId);
		this.stipend = stipend;	
	}
	void calculateSalary() {
		System.out.println(" Stripend of Intern is :"+stipend);
	}
	
}



public class UnderstandingOOPConcepts002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FullTimeEmployee FT = new FullTimeEmployee("Shradha",123,56000,7800);
		FT.calculateSalary();
		FT.displayDetails();
		
		PartTimeEmployee PT= new PartTimeEmployee("Aastha", 444,14,100);
		PT.calculateSalary();
		PT.displayDetails();
		
		NewEmployee ne = new PartTimeEmployee("Piyush", 777,40,200);
		ne.calculateSalary();
		ne.displayDetails();
		
		Intern i = new Intern("Ashish", 114, 2300);
		i.calculateSalary();
	}

}
