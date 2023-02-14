package Com.Obsqura.Training.Inheritance;

public class Salary extends Calculation {
	
	double totalsal, bp,deduction,bonus;
	double salarycalc(double bp, double deduction, double bonus)
	{
		this.bp=bp;
		this.deduction=deduction;
		this.bonus=bonus;
		totalsal=bp+super.hracalc(bp)+bonus-super.pfcalc(bp)-deduction;
		return totalsal;
	}
}


