package Com.Obsqura.Training.Inheritance;

public class Check extends Sum{

	
		// TODO Auto-generated method stub
	public void checkdivisibility()
	{
		int c=super.add(15,30);
		if(c%10==0)
		{
			System.out.println("The number is divisible by 10"); 
		}
		else
			
			System.out.println("The number is not divisible by 10");
	
	}
		
		
			public static void main(String[] args) {
				
				Check ob1=new Check();
				ob1.checkdivisibility();
				
	}

}
