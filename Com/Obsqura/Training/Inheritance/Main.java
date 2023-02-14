package Com.Obsqura.Training.Inheritance;

import java.util.Scanner;

public class Main extends Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner s=new Scanner(System.in);
		//System.out.print("Enter Basic Pay amount = ");
		//double bp=s.nextDouble();
		//System.out.print("Enter DA amount = ");
		//double d=s.nextDouble();
		//System.out.print("Enter Hra amount = ");
		//double hr=s.nextDouble();
		Manager m=new Manager();
		System.out.println("Total Salary of Manager= "+m.salarymanager(50000,2000,3000));
		System.out.println("bonus of Manager= "+m.bonusmanager(50000));
		Accountant a=new Accountant();
		System.out.println("Total Salary of Accountant= "+a.salaryaccountant(40000,2000,3000));
		System.out.println("bonus of Accountant= "+a.bonusaccountant(40000));
		
	}

}
