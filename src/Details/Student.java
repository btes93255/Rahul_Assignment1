package Details;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Student {
	int roll_no;
	String name;
	double eng_marks;
	double math_marks;
	double sci_marks;
	double total_marks;
	double average;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	
	Student() throws IOException {
		System.out.println("******************Enter Fresh Data for STUDENT******************* ");
		System.out.println("Enter roll number");
		roll_no = Integer.parseInt(br.readLine());
		System.out.println("Enter name");
		name = br.readLine();
		System.out.println("Marks of English out of 100");
	    eng_marks = Double.parseDouble(br.readLine());
	    System.out.println("Marks of Math out of 100");
	    math_marks = Double.parseDouble(br.readLine());
	    System.out.println("Marks of Science out of 100");
	    sci_marks = Double.parseDouble(br.readLine());
	}
	    void total() {
	    	total_marks = eng_marks + math_marks + sci_marks;
	    	System.out.println("Total marks are::" +total_marks);
	    	 }
	    void cal_average() {
	    	average = total_marks/3;
	    	System.out.println("Average is::" +average);
	    	}
	    void grade() {
	    	System.out.println("your grade is::");
	    	if(average>80) {
	    		System.out.println("A");
	    	}
	    	else if(average>60 && average<=80) {
	    		System.out.println("B");
	    	}
	    		else if(average>40 && average<=60) {
	    			
	    			System.out.println("C");
	    			}
	    		else {
	    			System.out.println("D");
	    		}
	    	}
	  public static void main(String[] args) throws IOException {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		s1.total();
		s2.total();
		s3.total();
		s1.cal_average();
		s2.cal_average();
		s3.cal_average();
		s1.grade();
		s2.grade();
		s3.grade();
		System.out.println("");
		

	}

}
