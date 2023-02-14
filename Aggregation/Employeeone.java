package Aggregation;

public class Employeeone {
	
	int emp_id;
	String emp_name;
	Carone car;
	Bike bike;
	
	public Employeeone(int emp_id, String emp_name, Carone car, Bike bike) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.car = car;
		this.bike = bike;
	}



	void display()
	{
		System.out.println("......Employee Details......");
		System.out.println(" Employee id    = " + emp_id);
		System.out.println(" Employee Name  = " + emp_name);
		System.out.println("......Employee's Car Details......");
		System.out.println(" Car Name       = " + car.carname);
		System.out.println(" Car Color      = " + car.color);
		System.out.println(" Car Reg.No     = " + car.regno);
		System.out.println("......Employee's Bike Details......");
		System.out.println(" Bike Name       = " + bike.bikename);
		System.out.println(" Bike Reg.No     = " + bike.regno);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carone c=new Carone("KL 13 B 4312","Grey","Lexus");
		Bike b=new Bike("KL 07 A 2567","Royal Enfield Classic 350");
		Employeeone e= new Employeeone(3001,"Ram",c,b);
		e.display();
	
		

	}

}
