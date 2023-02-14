package Com.Obsqura.Training.Inheritance;

public class Manager extends Employee{
	
	double ts,bp,d,hr,bon;
	public double salarymanager(double bp,double d,double hr)
	{
		this.bp=bp;
		this.d=d;
		this.hr=hr;
		ts=super.calculatesalary(bp,d,hr);
		return ts;

	}
	public double bonusmanager(double bp)
	{
		double bon=super.calbonus(bp);
		return bon;
	}
	
}

