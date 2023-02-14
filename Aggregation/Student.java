package Aggregation;

public class Student {
	int rollno;
	String name;
	Address address;
	public Student(int rollno, String name, Address address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	void display()
	{
		System.out.println("Roll No= " + rollno);
		System.out.println("Name = " + name);
		System.out.println("Address= " + address.city + ","+ address.country);
	}
	public static void main(String args[])
	{
		
		Address ad=new Address("Kannur","India");
		Address a=new Address("TVM","India");
		Student s=new Student(1,"Anu",ad);
		Student s1=new Student(2,"Niya",a);
				
		s.display();
		s1.display();
	}
	
}

