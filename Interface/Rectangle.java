package Interface;

public class Rectangle implements polygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r=new Rectangle();
		r.getarea(20,30);
	}

	public void getarea(int l,int b)
	{
		System.out.println("The Area of a rectangle = " + (l*b));
	}
}
