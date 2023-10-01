package main;

import java.util.ArrayList;
import java.util.Scanner;

public class PayRollSystem {

	//Private Data Member
	private static ArrayList<Employee> employeeList;
	private static PayRollSystem payRollSystem;
	
	private PayRollSystem() {}
	
	public static PayRollSystem getInstance() {
		
		if (payRollSystem == null) {
			payRollSystem = new PayRollSystem();
		}
		
		employeeList = new ArrayList<>();		
		return payRollSystem;

	}
	
	//employeeList access method
	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}
	
	//Add employee method
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
		System.out.println("\n" + employee.getName() + " added to the new pay roll system");
	}
	
	//Remove employee method
	public void removeEmployee(int id) {
		
		Employee employeeToRemove = null;
		
		for(Employee employee : employeeList) {
			
			if (employee.getId()==id) {
				employeeToRemove = employee;
				break;	
			}
			
		}
		
		if (employeeToRemove ==  null) {
			
			System.out.println("\nThe given employee does not exist");
			
			System.out.println("\nView employee list?\n1. Yes\n2. No");
			Scanner scn = new Scanner(System.in);
			int cho = scn.nextInt();
			
			switch(cho) {
			
			case 1: {
				
				System.out.println();
				displayEmployee();
				
			} break;
			
			case 2: break;
			
			default: System.out.println("Please enter valid input");
			break;
			
			}
			
		}
		
		if (employeeToRemove != null) {
			employeeList.remove(employeeToRemove);
			System.out.println("\nEmployee " + employeeToRemove.getId() + " (" + employeeToRemove.getName() + ") removed from the company");
			System.out.println("Returning to main menu");
		}
		
	}
	
	//Display employee method
	public void displayEmployee() {
		
		System.out.println("Employee details: ");
		
		for(Employee employee: employeeList) {
			System.out.println(employee);
		}
		
	}
	
}
