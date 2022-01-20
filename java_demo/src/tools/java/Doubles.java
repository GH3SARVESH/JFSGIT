package tools.java;
import java .util.Scanner;
public class Doubles {
	public static void main (String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter the number 1");
		java.lang.String number1string = scannerObject.nextLine();
		System.out.println("Enter the number 2");
		Object number2string = scannerObject.nextLine();
		Double number1= Double.parseDouble(number1string);
		Double number2= Double.parseDouble(number2string);
		
		Overloading mod = new Overloading();
		mod.adddouble(number1, number2);
	}
	public void adddouble(double a, double b)
	{
		double result=a=b;
		System.out.println(result);
	}
}