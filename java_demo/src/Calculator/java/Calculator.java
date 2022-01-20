package Calculator.java;

import java.util.Scanner;

public class Calculator {
	public static void main(String[]args) {
		Calculator calculatorObject = new Calculator();
		calculatorObject.add();
		calculatorObject.multiply();
		calculatorObject.subtract();
		calculatorObject.division();
	}
	
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
	
	public void multiply() {
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter Number 1 :");
		String number1String = scannerObject.nextLine();
		System.out.println("Enter Number 2 : ");
		String number2String = scannerObject.nextLine();
		int number1 = Integer.parseInt(number1String);
	 	// String "56" to int 56
 		int number2 = Integer.parseInt(number2String);
		int result = number1*number2;
		System.out.println("Result is : " +  result);
	}
	
	public void subtract() {
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter Number 1 :");
		String number1String = scannerObject.nextLine();
		System.out.println("Enter Number 2 : ");
		String number2String = scannerObject.nextLine();
		int number1 = Integer.parseInt(number1String);
	 	// String "56" to int 56
 		int number2 = Integer.parseInt(number2String);
		int result = number1-number2;
		System.out.println("Result is : " -  result);
		
	}	
	
	public void division() {
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter Number 1 :");
		String number1String = scannerObject.nextLine();
		System.out.println("Enter Number 2 : ");
		String number2String = scannerObject.nextLine();
		int number1 = Integer.parseInt(number1String);
	 	// String "56" to int 56
 		int number2 = Integer.parseInt(number2String);
		int result = number1/number2;
		System.out.println("Result is : " / result);
	}	
	
	
	
	
	
}
