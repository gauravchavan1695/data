package javaStreams;

import java.util.Arrays;
import java.util.List;

public class StreamProblems_AverageOfNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,5,7,8);
		
		double average = list.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println(average);

	}

}
