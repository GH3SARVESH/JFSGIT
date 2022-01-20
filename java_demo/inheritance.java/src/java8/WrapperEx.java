package java8;
import java.util.ArrayList;

public class WrapperEx {
	
	private static int intValue;
	private static Integer integerVal1;

	public static void main(String[] args) {
		String idstring ="12345";
		int idInt = Integer.parseInt(idstring);
		int result = idInt + idInt;
		System.out.println(result);
		int i = 100;
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		Integer integerVal = i;
		numberList.add(integerVal);
		integerVal1 = Integer.valueOf(i);
		
		Integer integer1 = new Integer(100);
		
		intValue = integer1;
	}
}


