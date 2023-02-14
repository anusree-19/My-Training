package Abstraction;

public class Contractor extends Employee {
	
	int workinghr;

	public Contractor(String name, int paymentperhr, int workinghr) {
		super(name, paymentperhr);
		this.workinghr = workinghr;
	}
	
	public int calculatesalary()
	{
		int s= getPaymentperhr() * workinghr;
		return s;
	}
}
