package Exceptions;

public class ArrayOutOfBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		
		{
			int a[] =new int [5];
			System.out.println(a[6]);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//e.printStackTrace();
			System.out.println(e);	
			System.out.println("Array is out of Bound");	
		}

	}

}
