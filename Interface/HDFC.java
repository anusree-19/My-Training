package Interface;

public class HDFC implements RBI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC h=new HDFC();
		h.reccuringdeposit(10000,6);

	}

	public void reccuringdeposit(double amount,double duration)
	{
		double rate=amount*interestrate;
		double r= rate*duration;
		System.out.println("Total Amount= " + r);
	}
}




