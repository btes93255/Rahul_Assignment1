package Sus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InvalidAmountException extends Exception{

	InvalidAmountException(String s){
		 super(s);
	 }
 }


 public class BankAtm {

	public static void main(String[] args) {
		try{
			BankAtm b=new BankAtm();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			long a;
			double available_bal;
			System.out.println("Enter ur pin :: ");
			a=Long.parseLong(br.readLine());
			char c;

			if(a==atmpin) {
				b.balance_enquiry();

				System.out.println("If u want to withdraw money then press key 'y' otherwise press any key.");
				c=br.readLine().charAt(0);

				if(c=='y') {
					b.withdraw();
					available_bal=balance-amount;
					if(balance<amount)
						throw new InvalidAmountException("Amount is invalid");
					else if(available_bal<10000) 
						throw new InvalidAmountException("Balance not deducted because after deduction balance<10000 which should not be.");
					else {
						System.out.println("Amount is deducted.");
						b.balance_enquiry();
					}
				}
				else 
					b.balance_enquiry();
			}
			else {
				System.out.println("ATM pin is incorrect.");
			}
		}

		catch(InvalidAmountException e) {
			e.printStackTrace();
		}

		catch(IOException e1) {

		}
	}


	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static long atmpin=1122;
	static double balance=15000;
	static double amount=0.00;
	static double bal;
	void withdraw() throws IOException {
		System.out.println("Enter the amount u want to withdraw:: ");
		amount=Long.parseLong(br.readLine());
	}
	void balance_enquiry() {
		bal=balance-amount;
		System.out.println("Your Balance is :: "+bal);
	}

}
