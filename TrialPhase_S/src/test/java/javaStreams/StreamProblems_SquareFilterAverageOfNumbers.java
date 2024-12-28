package javaStreams;

import java.util.Arrays;
import java.util.List;

public class StreamProblems_SquareFilterAverageOfNumbers {

	public static void main(String[] args) {
		
//square each value then consider only those having greater than 5 and then get the average of them.		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		double d = list.stream()
		                        .map(e -> e*e)
		                        .filter(e -> e>5)
		                        .mapToInt(e -> e)
		                        .average()
		                        .getAsDouble();
		System.out.printf("%.2f",d);
	}

}
