package Com.Obsqura.Training.Inheritance;

public class Employee {
	
	double totalsal,bp,d,hr,bonus;
	
	public double basic(double bp)
	{
		this.bp=bp;
		return bp;
	}
	
	public double da(double d)
	{
		this.d=d;
		return d;
	}
	public double hra(double hr)
	{
		this.hr=hr;
		return hr;
	}
	double calculatesalary(double bp,double d, double hr)
	{
		
		return totalsal=bp+d+hr;
		
	}
	
	double calbonus(double bp)
	{
		bonus=(bp*10)/100;
		return bonus;
	}
}
