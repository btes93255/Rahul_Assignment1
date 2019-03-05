package interfaceImplementss;

import java.util.Scanner;

public interface myPack {
	public boolean checkString(String s);

	public boolean checkInt(int i);
	
	class Palindrome implements myPack{
		
		public boolean checkString(String s) {
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
			return false;
		}
		public boolean checkInt(int i) {
	        int num = 121, reversedInteger = 0, remainder, originalInteger;
	        originalInteger = num; 
	        while( num != 0 )
	        {
	            remainder = num % 10;
	            reversedInteger = reversedInteger * 10 + remainder;
	            num  /= 10;
	        }
	        if (originalInteger == reversedInteger)
	            System.out.println(originalInteger + " is a palindrome.");
	        else
	            System.out.println(originalInteger + " is not a palindrome.");
			
	        return false;
			}
		}
	class CheckValue implements myPack{
		public boolean checkString(String s) {
			
			return false;
		}
		public boolean checkInt(int i) {
			return false;
		}
	}
	public static void main(String[] args) {
	Palindrome p= new Palindrome();
	p.checkString("this");
	p.checkInt(454);
	
	}

}

