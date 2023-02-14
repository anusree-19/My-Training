package Exceptions;

public class InvalidAge  extends Exception {
	public InvalidAge(String str)
	{
		super(str);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=14;
		try
		{
			if(age<18)
			{
				throw new InvalidAge("The age is not valid for voting");
			}
			else
			{
				System.out.println("The age is valid for voting");
			}
		}
		catch(InvalidAge e)
		{
			
			System.out.println(e);
			//e.printStackTrace();
		}

	}

}
