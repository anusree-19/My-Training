package String;
import java.util.Scanner;

public class MiddleStr{


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the String: ");
			String str = sc.nextLine();
			int n = str.length();

			if (n % 2 == 0) 
			{
				int b = n / 2;
				System.out.println("Middle character is =" + str.substring(b-1, b + 1));

			} 
			else
			{
				int c = n / 2;
				System.out.println("Middle character is =" + str.charAt(c));
			}

		}

	}


