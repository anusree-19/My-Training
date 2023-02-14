package Abstraction;

public abstract class Employee {

	String name;
	int paymentperhr;
	
	
	public Employee(String name, int paymentperhr) {
		super();
		this.name = name;
		this.paymentperhr = paymentperhr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPaymentperhr() {
		return paymentperhr;
	}

	public void setPaymentperhr(int paymentperhr) {
		this.paymentperhr = paymentperhr;
	}

	abstract int calculatesalary();
	
}
