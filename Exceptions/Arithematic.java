package Exceptions;

public class Arithematic {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		
		{
			int a=10/0;
			
		}
		catch(ArithmeticException e)
		{
			//e.printStackTrace();
			System.out.println(e);
			

		}
		
		System.out.println("You can’t divide a number by 0");
		
	}
}
