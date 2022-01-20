package tools.java;
import java .util.Scanner;
public class String Overloading {
	public static void main (String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NAME");
		String input1 = scannerObject.nextLine();
		System.out.println("ENTER THE LAST NAME");
		String input2 = scannerObject.nextLine();
		StringOverloading input = new StringOverloading();
		        input.addStrings(input1, input2);
	}
	public void addStrings(String str1 , String str2)
	{
		String result = str1 + str2 ;
		System.out.println( " THE NAME IS :" +result);
	}
}