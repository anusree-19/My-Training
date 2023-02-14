package Abstraction;

public class Circle extends Shape {
	
	void display()
	{
		System.out.println("This is Circle");
	}
	
	public static void main(String[] args) {
		
		Shape ob=new Circle();
		Shape s=new Rectangle();
		ob.display();
		s.display();
		
	}

}
