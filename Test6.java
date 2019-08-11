package com.walmart;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test6 {
	public static void main(String[] args) {
		//To implemet Starem builder 
		Stream.Builder<Integer> builder = Stream.builder();
		builder.add(10);
		builder.add(29);
		builder.add(50);
		Stream<Integer> stream = builder.build();
		//stream.map(x -> x+10).forEach(System.out::println);
		//Convert String to Stream
		IntStream streamOfChars = "abc".chars();
		//streamOfChars.forEach(System.out::print);
		
		//Summing Stram
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(integers.stream().reduce(0,(a,b) -> a+b));
		
		
		
		
	}

}
