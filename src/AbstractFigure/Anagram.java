package AbstractFigure;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two Strings");
		String str1 = sc.nextLine();
		String str2  = sc.nextLine();
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		String isstr1 = new String(arr1);
		String isstr2 = new String(arr2);
		if(isstr1.equals(isstr2)) {
			System.out.println("Above statement is ANAGRAM");
		}
		else
			System.out.println("Above statement is NOT ANAGRAM");
		}

}
