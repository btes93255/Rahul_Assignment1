package test3;

import java.util.Scanner;

public class Arr3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How many values you want to enter::");
		int a = s.nextInt();
		
		int[] arr = new int[a];
		System.out.println("Enter" +a+ "Integers");
		
		for(int i=0; i < a; i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.println("Entered Integers are::::::");
		for(int i=0; i < a; i++) {
			System.out.println(arr[i]);
		}
		}

	}

