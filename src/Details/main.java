package Details;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws IOException { 
	permanentEmp emp1 = new permanentEmp();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	char ch='y';
	do {
		System.out.println("1: View Leave Balance\n 2: Print Leave Details\n 3: Avail Leave\n 4: Calculate Total Salary" );
		int choice = Integer.parseInt(br.readLine());
			switch(choice){
			case 1:
				emp1.calculate_balance_leaves();
				break;
			case 2:
				emp1.print_leave_details();
				break;
			case 3:
				System.out.println("Enter number of leaves you want to avail");
				int no = Integer.parseInt(br.readLine());
				System.out.println("Which type of Leave you want");
				char type = br.readLine().charAt(0);
				boolean x = emp1.avail_leave(no, type);
				if(x) {
					System.out.println("Leave Granted");
				}
				else {
					System.out.println("Insufficient Leave Balance");
				}
				break;
			case 4:
				emp1.calculate_salary();
				break;
				}
				
			System.out.println("DO YOU WANT TO CONTINUE y/n");
			ch=br.readLine().charAt(0);
	}while(ch=='y');
	char ch1 ='n';
	TemporaryEmployee emp2 = new TemporaryEmployee();
	do {
		System.out.println("1: View Leave Balance\n 2: Avail Leave\n 3: Calculate Total Salary");
		int choice = Integer.parseInt(br.readLine());
			switch(choice){
			case 1:
				emp2.calculate_balance_leave();
				break;
			case 2:
				System.out.println("Enter number of leaves you want to avail");
				int no = Integer.parseInt(br.readLine());
				System.out.println("Which type of Leave you want");
				char type = br.readLine().charAt(0);
				boolean x = emp2.avail_leave(no, type);
				if(x) {
					System.out.println("Leave Granted");
				}
				else {
					System.out.println("Insufficient Leave Balance");
				}
				break;
			case 3:
				emp2.calculate_salary();
				break;
				}
			System.out.println("DO YOU WANT TO CONTINUE y/n");
			ch=br.readLine().charAt(0);
	}while(ch=='n');
	}

}

