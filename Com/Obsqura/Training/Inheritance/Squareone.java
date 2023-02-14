package Com.Obsqura.Training.Inheritance;

public class Squareone extends Rectangleone{
	public void print()
	{
		super.print();
		System.out.println("Square is a rectangle");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Squareone s=new Squareone();
		s.print();
		
	}

}
