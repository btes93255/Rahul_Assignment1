package AbstractFigure;

import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
//	Figure circle=new Circle();
//	circle.Find_Area();
//	circle.Find_Perimiter();
//	Figure rec=new Rectangle();
//	rec.Find_Area();
//	rec.Find_Perimiter();
//	Figure tri = new Triangle();
//	tri.Find_Area();
//	tri.Find_Perimiter();
	Figure[] fig = new Figure[6];
	for(int i=0; i<fig.length; i++) {
		if(i<=2) {
			fig[i] = new Circle();
		}
		else if(i>2 && i<4) {
			fig[i] = new Rectangle();
		}
		else
			fig[i] = new Triangle();
	}
	}

}
