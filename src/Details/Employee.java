package Details;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
	int empid;
	String name;
	int total_leaves;
	double total_salary;
	boolean avail_leave = true;
	int paid_leave=15;
	int sick_leave=5;
	int casual_leave=5;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Employee() throws IOException{
		System.out.println("*******************Enter Data of Employee******************");
		System.out.println("Enter your Employee id::");
		empid = Integer.parseInt(br.readLine());
		System.out.println("Enter Your Name::");
		name = br.readLine();
		/*System.out.println("Enter Total number Of leaves Taken by an Employee::");
		total_leaves = Integer.parseInt(br.readLine());*/
		/*System.out.println("Enter Total salary of an Employee::");
		total_salary = Double.parseDouble(br.readLine());*/
		}
	void calculate_balance_leaves() {
	
	}
	boolean avail_leave(int no_of_leaves, char type_of_leaves) {
	
			return true;
		}
	
	void calculate_salary() throws IOException {
		
		
	}
}

