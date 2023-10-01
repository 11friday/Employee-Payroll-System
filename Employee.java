package main;

public abstract class Employee {
	
	//Private Data Member
	private String name;
	
	private static int temp = 100000;
	{
		temp++;
		id = temp;
	}
	private final int id;
	
	//Constructor using fields
	public Employee(String name) {
		this.name = name;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	
	//Abstract method
	abstract double calculateSalary();
	
	//Overriding toString method
	@Override
	public String toString() {
		return "\nName: " + name + "\nID: " + id + "\nSalary: " + calculateSalary() + "\n";
	}
	
}
