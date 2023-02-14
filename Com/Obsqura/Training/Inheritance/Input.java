package Com.Obsqura.Training.Inheritance;

import java.util.Scanner;

public class Input extends Salary {
	
	double bp,deduction,bonus;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.print("Enter Basic Pay amount = ");
		double bp=s.nextDouble();
		System.out.print("Enter Deduction amount = ");
		double deduction=s.nextDouble();
		System.out.print("Enter Bonus amount = ");
		double bonus=s.nextDouble();
		System.out.println("-------------Salary Slip-------------");
		System.out.println("Basic pay       = " + bp);
		System.out.println("Deduction       = " + deduction);
		Input ip= new Input();
		System.out.println("Hra             = " + ip.hracalc(bp));
		System.out.println("Pf              = " + ip.pfcalc(bp));
		System.out.println("Bonus           = " + bonus);
		System.out.println("Total Salary    = " + ip.salarycalc(bp,deduction,bonus));
	}
	
}


