package Com.Obsqura.Training.Inheritance;

public class Rectangle {
	
	float x,y;
	
	Rectangle(float l,float b )
	{
		x=l;
		y=b;	
	}
	public void area()
	{
		System.out.println(x*y);
	}
	public void perimeter()
	{
		System.out.println((2*(x+y)));
	}

}
