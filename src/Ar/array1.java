package Ar;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter any 5 INTEGER values::");
	int a = s.nextInt();
	int[] arr = new int[5];
		for(int i=0; i < 5; i++) {
			System.out.println("Enter" +a+ "Integer");
			arr[i] = s.nextInt();
			}
	
	System.out.println("Entered Integers are::::::");
	System.out.println(a);
	}

}
