package Exception.java;
import java.util.Scanner;

public class UnhandledException {

	
		public static void main(String[] args) {
			String testString = "100";
			int number = Integer.parseInt(testString);
			Scanner scannerObject = new Scanner(System.in); 
			System.out.println("Enter Number 1 :");
			String number1String = scannerObject.nextLine();
			int number1 = 0;
			try {
				 number1 = Integer.parseInt(number1String);
			    }catch (NumberFormatException numberFormatExceptionObject)	{
			    	System.out.println("Enter the valid number");
			    }
			System.out.println("Enter Number 2 :");
			String number2String = scannerObject.nextLine();
			
			try {
			    int number2 = Integer.parseInt(number2String);
			    int result = number1 + number2;
				System.out.println("Result is :" +result);
			    }catch (NumberFormatException numberFormatExceptionObject)	{
					System.out.println("Enter the valid number");
				
			}finally {
				System.out.println("Switch off the the Calculator");
			}
			}
			

			
					
		}

	

