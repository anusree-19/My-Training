package Com.Obsqura.Training.Inheritance;

public class Accountant extends Employee {

	double tsal,bp,d,hr,bon;
	public double salaryaccountant(double bp,double d,double hr)
	{
		this.bp=bp;
		this.d=d;
		this.hr=hr;
		tsal=super.calculatesalary(bp,d,hr);
		return tsal;

	}
	public double bonusaccountant(double bp)
	{
		double bon=super.calbonus(bp);
		return bon;
	}

}
