package javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamProblems_SumOfAllNumbers {

	public static void main(String[] args) {
		
		List<Integer> numberslist = Arrays.asList(1,2,44,5,89,54);		
		Optional<Integer> op = numberslist.stream().reduce((a,b) -> a+b);
		
		System.out.println(op.get());

	}

}
