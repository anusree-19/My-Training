package Exceptions;

public class CheckThrow {
	
  static void calc() throws ArithmeticException
	{
		int a=10,b=0;
		if(b==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			int c=a/b;
			System.out.println(c);
		}
	}

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		//CheckThrow x=new CheckThrow();
		//x.calc();
		try
		
		{
			calc();
			
		}
	catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("You can’t divide a number by 0");

	}
}
