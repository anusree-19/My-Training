package Encapsulation;

public class User {

	public static void main(String args[])
	{
		Bank ob=new Bank();
		ob.setPin(1234);
		int r=ob.getPin();
		System.out.println(r);
	}
}
