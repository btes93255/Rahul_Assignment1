package application;

public class student {
	private int age;
	private String name;
	
	public student(int age, String name) {
		this.age = age;
		this.name = name;
		
	}
	
 public void showStudent() {
	 System.out.println("Student name:" +name);
	 System.out.println("Student age:" +age);
	 
 }
}
