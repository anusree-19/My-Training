package Com.Obsqura.Training.Inheritance;
import java.util.Scanner;

public class Season {
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	        sc= new Scanner(System.in);
	        System.out.print("Enter cost: ");
	        double cost= sc.nextDouble();
	        Onseason on=new Onseason(cost);
	        Offseason off=new Offseason(cost);
	        System.out.println("Offseason cost = " + off.discount());
	        System.out.println("Onseason cost = " + on.discount());
	        
	    }
	}


