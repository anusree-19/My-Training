package Aggregation;

public class Employee {
	int emp_id;
	String emp_name;
	Car car;
	public Employee(int emp_id, String emp_name, Car car) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.car = car;
	}
	void display()
	{
		System.out.println("......Employee Details......");
		System.out.println(" Employee id    = " + emp_id);
		System.out.println(" Employee Name  = " + emp_name);
		System.out.println(" Car Name       = " + car.carname);
		System.out.println(" Car Color      = " + car.color);
		System.out.println(" Car Reg.No     = " + car.regno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car("KL 13 B 4312","Grey","Lexus");
		Employee e=new Employee(5001,"Siju",c);
		e.display();
		}
	}
	

