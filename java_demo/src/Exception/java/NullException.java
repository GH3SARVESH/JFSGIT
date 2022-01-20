package Exception.java;

import java.util.Scanner;


public class NullException {
	public static void main(String []args) {
		//Calculator calculatorObject = new Calculator();
		Calculator calculatorObject =  null;
		calculatorObject =  new Calculator();
		System.out.println("ADD");
		try {
			calculatorObject.add();
		} catch (NullPointerException nullpointerException) {
			System.out.println("The object is not instantiated .....");
		
		}
	}
}
 class Calculator {
			
	
			
		public void add() {
			Scanner scannerObject = new Scanner(System.in);
			System.out.println("Enter Number 1 :");
			String number1String = scannerObject.nextLine();
			System.out.println("Enter Number 2 : ");
			String number2String = scannerObject.nextLine();
			int number1 = Integer.parseInt(number1String);
			int number2 = Integer.parseInt(number2String);
			int result = number1+number2;
			System.out.println("Result is : " + result);		
		}
		
	}


