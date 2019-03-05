package AbstractFigure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Rectangle extends Figure {
	double dim2;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public void Find_Area() throws IOException{
		System.out.println("***********AREA OF RECTANGLE***********");
		System.out.println("Enter width of Rectangle");
		dim1 = Double.parseDouble(br.readLine());
		System.out.println("Enter length of Rectangle");
		dim2 = Double.parseDouble(br.readLine());
		double Area = dim1 * dim2;
		System.out.println("The Area of Rectangle is " +Area);		
	}
	public void Find_Perimiter() throws IOException {
		System.out.println("***************PERIMITER OF RECTANGLE************");
		System.out.println("Enter width of Recatngle");
		dim1 = Double.parseDouble(br.readLine());
		System.out.println("Enter length of Rectangle");
		dim2 = Double.parseDouble(br.readLine());
		double Perimiter = 2*(dim1 + dim2);
		System.out.println("The Perimiter of a Rectangle is " +Perimiter);
	}
	
	
	
	
}
