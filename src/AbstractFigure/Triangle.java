package AbstractFigure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Triangle extends Figure {
	double dim2, dim3;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public void Find_Area() throws IOException {
	System.out.println("*************AREA OF TRIANGLE*************");
	System.out.println("Enter Height of A Triangle");
	dim1 = Double.parseDouble(br.readLine());
	System.out.println("Enter Base of A Triangle");
	dim2 = Double.parseDouble(br.readLine());
	System.out.println("Enter Hypotenuse of A Triangle");
	dim3 = Double.parseDouble(br.readLine());
	double Area = (dim1 + dim2 + dim3)/2;
	Math.sqrt(Area*(Area-dim1)*(Area-dim2)*(Area-dim3));
	System.out.println("The Area of A Triangle is.... " +Area);
	}
	
	public void Find_Perimiter() throws IOException{
		System.out.println("************PERIMITER OF TRIANGLE************");
		System.out.println("Enter Height of A Triangle");
		dim1 = Double.parseDouble(br.readLine());
		System.out.println("Enter Base of A Triangle");
		dim2 = Double.parseDouble(br.readLine());
		System.out.println("Enter Hypotenuse of A Triangle");
		dim3 = Double.parseDouble(br.readLine());
		double Perimiter = dim1 + dim2 + dim3;
		System.out.println("The Perimiter of A Triangle is..." +Perimiter);
		
	}
	
}
