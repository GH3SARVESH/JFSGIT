package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;


public class MapFilterReduce1 {
	
	public static void main(String[] args) {
		mapping_operation();
	}
	
	private static void mapping_operation() {
		String[] players = new String[] {"sam","peter","billy","lily"};
		 Stream<String> playerStream = Arrays.stream(players);
		 Stream<String> upperCaseStream = playerStream.map(player -> player.toUpperCase());
		 upperCaseStream.forEach(System.out::println);
	}
}


