package main;

public class FullTimeEmployee extends Employee{
	
	//Private Data Member
	private double monthlySalary;
	
	//Getters and setters
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	//Constructor using fields
	public FullTimeEmployee(String name, double monthlySalary) {
		super(name);
		this.monthlySalary = monthlySalary;
	}
	
	//Overriding abstract method
	@Override
	public double calculateSalary() {
		return monthlySalary;
	}

}
