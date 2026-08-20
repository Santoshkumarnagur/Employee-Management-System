package com.company.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.company.entity.Employee;

public class EmployeeManagementSystemApp {

	private static SessionFactory sessionFactory = 
			new Configuration()
			.configure("hibernate.cfg.xml")
			.buildSessionFactory();
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		while (true) {
			 System.out.println("\n--- Employee Management System ---");
	            System.out.println("1. Add Employee");
	            System.out.println("2. View Employee");
	            System.out.println("3. Update Employee");
	            System.out.println("4. Delete Employee");
	            System.out.println("5. Exit");

	            int choice = readMenuChoice();
	            
	            switch (choice) {

                case 1 -> addEmployee();

                case 2 -> viewEmployee();

                case 3 -> updateEmployee();

                case 4 -> deleteEmployee();

                case 5 -> {
                    System.out.println("Exiting program...");
                    sessionFactory.close();
                    scanner.close();
                    return;
                }

                default ->
                    System.out.println("Invalid choice. Please try again.");
            } 
	            
		}
		
		
	}
	
	private static int readInteger(String message) {

	    while (true) {

	        System.out.print(message);

	        if (scanner.hasNextInt()) {

	            return scanner.nextInt();

	        } else {

	            System.out.println("Please enter a valid number.");
	            scanner.next();
	        }
	    }
	}
	
	private static double readSalary(String message) {

	    while (true) {

	        System.out.print(message);

	        if (scanner.hasNextDouble()) {

	            double salary = scanner.nextDouble();

	            if (salary > 0) {
	                return salary;
	            }

	            System.out.println("Salary must be greater than 0.");

	        } else {

	            System.out.println("Please enter a valid salary.");
	            scanner.next();
	        }
	    }
	    
	    
	}
	
	private static String readName(String message) {

	    while (true) {

	        System.out.print(message);

	        String name = scanner.nextLine().trim();

	        if (!name.isEmpty() && name.matches("[a-zA-Z ]+")) {
	            return name;
	        }

	        System.out.println(
	                "Invalid name. Please enter letters and spaces only."
	        );
	    }
	}
	
	private static String readDesignation(String message) {

	    while (true) {

	        System.out.print(message);

	        String designation = scanner.nextLine().trim();

	        if (!designation.isEmpty()
	                && designation.matches("[a-zA-Z ]+")) {

	            return designation;
	        }

	        System.out.println(
	                "Invalid designation. Please enter letters and spaces only."
	        );
	    }
	}
	
	private static String readDepartment(String message) {

	    while (true) {

	        System.out.print(message);

	        String department = scanner.nextLine().trim();

	        if (!department.isEmpty()
	                && department.matches("[a-zA-Z ]+")) {

	            return department;
	        }

	        System.out.println(
	                "Invalid department. Please enter letters and spaces only."
	        );
	    }
	}
	
	private static int readMenuChoice() {

	    while (true) {

	        System.out.print("Enter your choice: ");

	        if (scanner.hasNextInt()) {

	            int choice = scanner.nextInt();

	            if (choice >= 1 && choice <= 5) {
	                return choice;
	            }

	            System.out.println(
	                    "Invalid choice. Please enter a number from 1 to 5."
	            );

	        } else {

	            System.out.println(
	                    "Invalid input. Please enter a number from 1 to 5."
	            );

	            scanner.next();
	        }
	    }
	}
	
	private static void addEmployee() {

	    Session session = sessionFactory.openSession();
	    Transaction transaction = session.beginTransaction();

	    try {

	        Employee emp = new Employee();

	        scanner.nextLine();

	        String name = readName("Enter Name: ");
	        emp.setName(name);

	        double salary = readSalary("Enter Salary: ");
	        emp.setSalary(salary);
	        
	        scanner.nextLine();

	        String designation = readDesignation("Enter Designation: ");
	        emp.setDesignation(designation);

	        String department = readDepartment("Enter Department: ");
	        emp.setDepartment(department);

	        session.persist(emp);

	        transaction.commit();

	        System.out.println(
	                "Employee added successfully with ID: "
	                + emp.getId()
	        );

	    } catch (Exception e) {

	        transaction.rollback();

	        System.out.println(
	                "Error while adding employee: "
	                + e.getMessage()
	        );

	    } finally {

	        session.close();
	    }
	}
	
	private static void viewEmployee() {

	    Session session = sessionFactory.openSession();

	    try {

	    		int id = readInteger("Enter Employee ID: ");

	        Employee emp = session.get(Employee.class, id);

	        if (emp != null) {

	            System.out.println("\n----- Employee Details -----");
	            System.out.println("ID          : " + emp.getId());
	            System.out.println("Name        : " + emp.getName());
	            System.out.println("Salary      : " + emp.getSalary());
	            System.out.println("Designation : " + emp.getDesignation());
	            System.out.println("Department  : " + emp.getDepartment());

	        } else {

	            System.out.println("Employee not found.");
	        }

	    } catch (Exception e) {

	        System.out.println(
	                "Error while fetching employee: "
	                + e.getMessage()
	        );

	    } finally {

	        session.close();
	    }
	}
	
	private static void updateEmployee() {

	    Session session = sessionFactory.openSession();
	    Transaction transaction = session.beginTransaction();

	    try {

	    		int id = readInteger("Enter Employee ID: ");
	        scanner.nextLine();

	        Employee emp = session.get(Employee.class, id);

	        if (emp != null) {

		        	String name = readName("Enter New Name: ");
		        	emp.setName(name);

	            double salary = readSalary("Enter Salary: ");
	            emp.setSalary(salary);
	            scanner.nextLine();

	            System.out.print("Enter New Designation: ");
	            emp.setDesignation(scanner.nextLine());

	            String department = readDepartment("Enter New Department: ");
	            emp.setDepartment(department);

	            transaction.commit();

	            System.out.println("Employee updated successfully.");

	        } else {

	            System.out.println("Employee not found.");
	            transaction.rollback();
	        }

	    } catch (Exception e) {

	        transaction.rollback();

	        System.out.println(
	                "Error while updating employee: "
	                + e.getMessage()
	        );

	    } finally {

	        session.close();
	    }
	}
	
	private static void deleteEmployee() {

	    Session session = sessionFactory.openSession();
	    Transaction transaction = session.beginTransaction();

	    try {

	    		int id = readInteger("Enter Employee ID: ");

	        Employee emp = session.get(Employee.class, id);

	        if (emp != null) {

	            session.remove(emp);

	            transaction.commit();

	            System.out.println("Employee deleted successfully.");

	        } else {

	            System.out.println("Employee not found.");

	            transaction.rollback();
	        }

	    } catch (Exception e) {

	        transaction.rollback();

	        System.out.println("Error while deleting employee: "
	                + e.getMessage());

	    } finally {

	        session.close();
	    }
	}

}
