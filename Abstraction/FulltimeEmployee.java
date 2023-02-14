package Abstraction;

public class FulltimeEmployee extends Employee{
	
	public FulltimeEmployee(String name, int paymentperhr) {
		super(name, paymentperhr);
		
	}
	
	public int calculatesalary()
	{
		int fs= getPaymentperhr() * 8;
		return fs;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee con=new Contractor("Contractor",450,9);
		Employee ft=new FulltimeEmployee("FullTimeEmployee", 750);
		System.out.println("Salary of Contractor= "+ con.calculatesalary());
		System.out.println("Salary of FullTime Employee= " + ft.calculatesalary());
		

	}

}
