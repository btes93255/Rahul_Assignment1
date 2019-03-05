package Details;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class permanentEmp extends Employee {
	int paid_leave=15;
	int sick_leave=5;
	int casual_leave=5;
	double basic;
	double hra;
	double pfa;
permanentEmp() throws IOException{
	System.out.println("***************Data For Permanent Employee****************");
	}
	
	void  print_leave_details(){
		System.out.println("Leave Details as follows::");
		System.out.println("If you want paid leave::" +paid_leave);
		System.out.println("If you want sick leave::" +sick_leave);
		System.out.println("If you want casual leave::" +casual_leave);
		}
	void calculate_balance_leaves() {
		System.out.println("Balance leaves is::");
		int  total_leaves = paid_leave + sick_leave + casual_leave;
		 System.out.println("Available Leave Balance is: "+total_leaves);
		}
	boolean avail_leave(int no_of_leaves, char type_of_leaves) {
		boolean flag = false;
		if(type_of_leaves=='p') {
			if(no_of_leaves<=paid_leave) {
				flag = true;
				paid_leave -= no_of_leaves;
			}
		}
		if(type_of_leaves=='s') {
			if(no_of_leaves<=sick_leave) {
				flag = true;
				sick_leave -= no_of_leaves;
			}
		}
		if(type_of_leaves=='c') {
			if(no_of_leaves<=casual_leave) {
				flag = true;
				casual_leave -= no_of_leaves;
			}
		}
		return flag;
		}
	void calculate_salary() throws IOException {
		System.out.println("Basic salary of an permanent employee::");
		double basic = Double.parseDouble(br.readLine());
		System.out.println("Enter House Rent Allowance");
		double hra = Double.parseDouble(br.readLine());
		hra = (basic*7)/100;
		System.out.println("THE HRA is:: " +hra);
		System.out.println("Enter per year for Family");
		double pfa = Double.parseDouble(br.readLine());
		pfa = (basic*12)/100;
		System.out.println("THE PFA is:: " +pfa);
		total_salary = basic + hra - pfa;
		System.out.println(total_salary);
		}

 }
