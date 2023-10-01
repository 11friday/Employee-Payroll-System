package main;

public class PartTimeEmployee extends Employee{
	
	//Private Data Members
	private int hoursWorked;
	private double hourlyRate;
	
	//Constructor using fields
	public PartTimeEmployee(String name) {
		super(name);
	}
	
	public PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
		super(name);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	//Overriding abstract method
	@Override
	public double calculateSalary() {
		return hoursWorked*hourlyRate;
	}

}
