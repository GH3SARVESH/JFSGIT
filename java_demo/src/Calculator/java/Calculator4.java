package Calculator.java;
import java.util.Scanner;

public class Calculator4 {
	public static void main(String[] args) {
		System.out.println("ADDing TWO INTS");
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter number 1");
		String number1String = scannerObject.nextline();
		System.out.println("Enter number  2");
		String number2String = scannerObject.nextline();
		int number1 = Integer.parseInt("number1String");
		int number2 = Integer.parseInt("number2String");
		
		
		Calculator4 calculator4Object=  new Calculator4();
		calculator4Object.addint(number1,number2);
		
		System.out.println("ADDINGTWO FLOATS");
		System.out.println("enter number 1");
		String number3string = scannerObject.nextLine();
		System.out.println("enter number 2");
		String number4string = scannerObject.nextLine();
		float number3 = float.parseFloat("number3String");
		float number4 =float.parseFloat("number4String");
		
		calculator4Object =  new Calculator4();
		calculator4Object.addFloat(number3,number4);
		
		
				
	}
	
	public void addint(int num1,int num2) {
		int result = num1 + num2;
		System.out.println(result);
		
	}
	public void addFloat(float num1,float num2) {
		float result = num1 + num2;
		System.out.println(result);
		
	}

}
