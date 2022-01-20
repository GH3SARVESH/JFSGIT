package tools.java;
import java.util.Scanner;

public class ifelse {
	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter alphabet : ");
		String input = scannerObject.nextLine();
		if(input.equals("a")) {
			System.out.println("The input is a vovel" + input);
		}
		else if(input.equals ("e")) {
			System.out.println("The input is a vovel" + input);
			
		}
		else if(input.equals ("i")) {
			System.out.println("The input is a vovel" + input);
		}
		else if(input.equals ("o")) {
			System.out.println("The input is a vovel" + input);
		}
		else if(input.equals ("u")) {
			System.out.println("The input is a vovel" + input);
		}
		else
		{
			System.out.println("Not a vovel");
		}
		
	}

}
