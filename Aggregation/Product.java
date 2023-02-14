package Aggregation;

public class Product {
	
	int id;
	String name,desp;
	LineItem line;
	
	public Product(int id, String name, String desp, LineItem line) {
		super();
		this.id = id;
		this.name = name;
		this.desp = desp;
		this.line = line;
	}
	void display()
	{
		System.out.println(" Product id   = " + id);
		System.out.println(" Product Name = " + name);
		System.out.println(" Description  = " + desp);
		System.out.println(" Quantity     = " + line.qty + "gm");
		System.out.println(" Product      = " + line.p);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LineItem l=new LineItem(250,"Cream");
		
		Product pr=new Product(1001,"Dove Skin care cream","Soft and 24 hours of moisturization",l);
		pr.display();
	}}
