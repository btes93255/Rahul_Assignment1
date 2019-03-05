package AbstractFigure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Circle extends Figure{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

public void Find_Area() throws IOException {
	System.out.println("**********AREA OF CIRCLE***********");
	float pi = 3.14f;
	System.out.println("Enter the Radius of Circle...");
	dim1 = Double.parseDouble(br.readLine());
	double Area = pi*dim1*dim1;
	System.out.println("The area of a Circle is.... " +Area);
	}

public  void Find_Perimiter() throws IOException {
	System.out.println("***********PERIMITER OF CIRCLE*********");
	float pi = 3.14f;
	System.out.println("Enter radius of a Circle....");
	dim1 = Double.parseDouble(br.readLine());
	double Perimiter = 2 * pi * dim1;
	System.out.println("The Perimiter of a Circle is.... " +Perimiter);
	}

}