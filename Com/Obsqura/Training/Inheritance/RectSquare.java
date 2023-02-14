package Com.Obsqura.Training.Inheritance;

public class RectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(10,20);
		Square sq= new Square(6);
		System.out.print(" The area of a Rectangle = ");
		r.area();
		System.out.print(" The perimeter of a Rectangle = ");
		r.perimeter();
		System.out.print(" The area of a Square = ");
		sq.area();
		System.out.print(" The perimeter of a Square = ");
		sq.perimeter();
		
	}

}
