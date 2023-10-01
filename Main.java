package main;
import java.util.Scanner;

//null value of employee details

public class Main {

	public static void main(String[] args) {
		
		PayRollSystem payRollSystem = PayRollSystem.getInstance();
		Scanner scn = new Scanner(System.in);
		boolean flag = true;
		
		System.out.println("WELCOME TO EMPLOYEE PAYROLL MANAGEMENT SYSTEM");
		
		do {
			
			System.out.println("\n1. ADD EMPLOYEE\n2. VIEW EMPLOYEE\n3. REMOVE EMPLOYEE\n4. EXIT");
			int choice = scn.nextInt();
			
			switch(choice) {
			
			case 1: {
				
				System.out.println("\nPlease choose the type of employee\n1. Full Time\n2. Part Time\n3. Exit");
				int c = scn.nextInt();
				
				switch (c) {
				
				case 1: {
					
					System.out.println("\nAdding full time employee\n");
					FullTimeEmployee emp = new FullTimeEmployee(null, 0);
					
					System.out.print("Name: ");
					String name = scn.next();
					
					System.out.println("ID (auto_generated): " + emp.getId());
					
					System.out.print("Salary: ");
					double sal = scn.nextDouble();
					
					emp.setName(name);
					emp.setMonthlySalary(sal);
					
					System.out.println("\nEmployee added to the company");
					
					System.out.println("\nAdd the employee to the pay roll system as well?\n1. Yes\n2. No");
					int ch = scn.nextInt();
					
					switch(ch) {
					
					case 1: payRollSystem.addEmployee(emp);
					break;
					
					case 2: System.out.println("\nEmployee not added to the pay roll system");break;
					
					default: System.out.println("Please enter a valid input");
					System.out.println("Returning to main menu"); 
					break;
					
					}
					
					System.out.println("\nEmployee detail: ");
					System.out.println("Name: " + emp.getName() + "\nID: " + emp.getId() + "\nSalary: " + ((FullTimeEmployee)emp).calculateSalary() );
					System.out.println("\nReturning to main menu");
					
				} break;
				
				case 2: {
					
					System.out.println("\nPart time employee ID will be generated in the end\n");
					PartTimeEmployee emp = null;
					
					System.out.print("Name: ");
					String name = scn.next();
					
					
					System.out.println("\nEmployee added to the company");
					
					
					System.out.println("\nAdd the employee to the pay roll system as well?\n1. Yes\n2. No");
					int ch = scn.nextInt();
					
					switch(ch) {
					
					case 1: {
						
						System.out.print("Numbers of hour worked: ");
						int hoursWorked = scn.nextInt();
						
						System.out.print("Hourly rate: ");
						double hourlyRate = scn.nextDouble();
						
						emp = new PartTimeEmployee(name, hoursWorked, hourlyRate);
						
						payRollSystem.addEmployee(emp);
						
					} break;
					
					case 2: {
						
						emp = new PartTimeEmployee(name);
						System.out.println("Returning to main menu");
						
					} break;
					
					default: System.out.println("\nPlease enter a valid input");
					System.out.println("Returning to main menu"); 
					break;
					
					}
					
					System.out.println("\nEmployee detail: ");
					System.out.println("Name: " + emp.getName() + "\nID: " + emp.getId() + "\nSalary: " + ((PartTimeEmployee)emp).calculateSalary() );
					System.out.println("\nReturning to main menu");
					
					
				} break;
				
				case 3: break;
				
				default: System.out.println("\nPlease enter a valid input");
				System.out.println("Returning to main menu"); 
				break;
				
				}
				
			} break;
			
			case 2: {
				
				payRollSystem.displayEmployee(); 
				System.out.println("\nReturning to main menu");
				break;
				
			}
			
			case 3: {
				
				System.out.print("\nPlease provide the employee ID of the employee to be removed: ");
				int id = scn.nextInt();
				payRollSystem.removeEmployee(id);
				
			} break;
			
			case 4: System.out.println("\nThank you for using the Employee Payroll System!!\n\nProgram Terminated"); flag = false; break;
			
			default: System.out.println("\nPlease enter a valid input");
			System.out.println("Returning to main menu"); 
			break;
			
			}
			
		} while(flag);
		
	}
}
