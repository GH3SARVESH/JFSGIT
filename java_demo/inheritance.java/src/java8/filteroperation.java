package java8;

import java.util.Arrays;
import java.util.stream.Stream;

public class filteroperation {

	
	 
	        // A simple array
	        String[] players = new String[] { "sam", "peter", "billy", "lilly" };
//	        Integer[] playerAge = new Integer[] { 1,2,3,4,5 };
	        Stream<String> playerStream = Arrays.stream(players);
//	        Stream<Integer> playerAgeStream = Arrays.stream(playerAge);
	        Stream<String> filteredStream = playerStream.filter(player -> player.length() > 3);
//	        upperCaseStream.forEach(player -> System.out.println(player));
	        filteredStream.forEach(System.out::println);        
	    }

