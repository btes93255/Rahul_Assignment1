package Details;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemporaryEmployee extends Employee{

	TemporaryEmployee() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("*************Data for Temporary Employee***************");
		//double basic = Double.parseDouble(br.readLine());
		}
	void calculate_balance_leave() {
		System.out.println("Your BAlance leaves are::");
		total_leaves = paid_leave + casual_leave + sick_leave;
		System.out.println(total_leaves);
	}
	boolean avail_leave(int no_of_leaves, char type_of_leaves){
		boolean flag = false;
		if(type_of_leaves=='p') {
			if(no_of_leaves <= paid_leave) {
				flag = true;
				paid_leave -= total_leaves;
			}
		}
		if(type_of_leaves=='c') {
			if(no_of_leaves <= casual_leave) {
				flag = true;
				casual_leave -= total_leaves;
			}
		}
		if(type_of_leaves=='s') {
		if(no_of_leaves <= sick_leave) {
			flag = true;
			sick_leave -= no_of_leaves;
		}
		}
		return flag;
	}
	void calculate_salary() throws IOException {
		System.out.println("Enter basic salary of an Temporary Employee");
		double basic = Double.parseDouble(br.readLine());
		System.out.println("Enter House Rent Allowance");
		double hra = Double.parseDouble(br.readLine());
		hra = (basic*7)/100;
		System.out.println("THE HRA is:: " +hra);
		System.out.println("Enter per year for family");
		double pfa = Double.parseDouble(br.readLine());
		pfa = (basic*12)/100;
		System.out.println("THE PFA is:: " +pfa);
		double total_salary = basic + hra - pfa;
		System.out.println(total_salary);
	}
}
