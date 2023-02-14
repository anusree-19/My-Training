package Encapsulation;

public class User {

	public static void main(String args[])
	{
		Bank ob=new Bank();
		Bank ob1=new Bank();
		Bank ob2=new Bank();
		Bank ob3=new Bank();
		ob.setPin(1234);
		ob1.setPin(1001);
		ob2.setPin(1212);
		ob3.setPin(2000);
		int r=ob.getPin();
		int s=ob1.getPin();
		int x=ob2.getPin();
		int y=ob3.getPin();
		if(r==1234)
		{
		System.out.println(r + " is "+ " Valid Pin");
		}
		if(s==1001)
		{
			System.out.println(s + " is "+ " Valid Pin");
		}
		if(x==1212)
		{
			System.out.println(x + " is "+ " Valid Pin");
		}
		if(y==1212)
		{
			System.out.println(y + " is "+ " Valid Pin");
		}
		else
		{
			System.out.println("InValid Pin");
		}	
	
		System.out.println("hello world");
	}
	
}

