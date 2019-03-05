package src.comparator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentComparator {
	 private int roll_no;//instance variables
	    
	    String name;
	    private float marks;
	    private char gender;
	    int i=1;
	    static String trainer_nm="Shikhi";
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   
	public StudentComparator()throws IOException
	{
	    //System.out.println("Enter data for Student " + i);
	    //i++;
	    System.out.println("Enter your roll_no");
	    this.roll_no=Integer.parseInt(br.readLine());
	    System.out.println("Enter your gender");
	    //gender=(char)br.read();
	    this.gender=br.readLine().charAt(0);
	    System.out.println("Enter your name");
	    this.name=br.readLine();
	    System.out.println("Enter your marks");
	    this.marks=Float.parseFloat(br.readLine());
	}
	    void display()//instance method
	    {
	        int x=10;
	        System.out.println(roll_no +" "+ name+" "+marks+" "+gender+" "+StudentComparator.trainer_nm);
	    }
	    public void setRoll_no(int roll_no) {
	        this.roll_no = roll_no;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public void setMarks(float marks) {
	        this.marks = marks;
	    }
	    public void setGender(char gender) {
	        this.gender = gender;
	    }
	    public int getRoll_no() {
	        return roll_no;
	    }
	    public String getName() {
	        return name;
	    }
	    public float getMarks() {
	        return marks;
	    }
	    public char getGender() {
	        return gender;
	    }   
	
}
