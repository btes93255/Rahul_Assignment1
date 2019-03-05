package Check;

import java.util.Scanner;

public class Pali {

	public static void main(String[] args) {
	String a, b="";
	System.out.println("Enter any Srting");
	Scanner sc = new Scanner(System.in);
	a=sc.nextLine();
	int n = a.length();
	for(int i=n-1; i>=0; i--) {
		b = b+a.charAt(i);
	}
	if(a.contentEquals(b)) {
		System.out.println("The String is Palindrome");
	}
	else
		System.out.println("The String is not palindrome");
	}
}


