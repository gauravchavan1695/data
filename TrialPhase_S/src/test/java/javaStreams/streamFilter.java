package javaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamFilter {

	public static void main(String[] args) {
		
// filter even numbers from arraylist	
// filter string with conditions like string having more than 5 characters		
// filter list of string and remove null's		

		
//getting even numbers only from arraylist		|
		
		List<Integer> mylist1 = Arrays.asList(1,3,4,2,6,7,8,9,5);
//		List<Integer>finallist1 = mylist1.stream().filter(n->n%2==0).collect(Collectors.toList());
//		System.out.println(finallist1);
		
		mylist1.stream().filter(n->n%2==0).forEach(System.out::print);
	
	}

}
