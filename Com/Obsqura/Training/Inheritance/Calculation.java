package Com.Obsqura.Training.Inheritance;

public class Calculation {

	double hra,pf,bp;
	 
	double hracalc(double bp)
	{
		this.bp=bp;
		hra=(bp*5)/100;
		return hra;
	}
	
	double pfcalc(double bp)
	{
		this.bp=bp;
		pf=(bp*20)/100;
		return pf;
	}
}




