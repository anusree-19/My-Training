package Com.Obsqura.Training.Inheritance;

public class Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeNew e=new EmployeeNew();
		e.name="Ram";
		e.age=35;
		e.pnum="987654321";
		e.address="Kerala";
		e.salary=50000;
		e.specialization="Developer";
		System.out.print("Employee Salary=");
		e.printSalary();
		
		ManagerNew m=new ManagerNew();
		m.name="Rahul";
		m.age=42;
		m.pnum="9876675490";
		m.address="Chennai";
		m.salary=75000;
		m.department="IT";
		System.out.print("Manager Salary=");
		m.printSalary();

	}

}
