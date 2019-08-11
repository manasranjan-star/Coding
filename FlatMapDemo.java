package com.walmart;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapDemo {
	public static void main(String[] args) {
		
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		Stream<int[]> s = Stream.of(arr);
		//IntStream intstream = s.flatMap(Arrays.stream(s));
		//IntStream intstream = s.flatMap(s -> s.str);
		IntStream i = s.flatMapToInt(a -> Arrays.stream(a));
		//i.forEach(System.out::println);
		
		int arr2[] = {1,2,3,4,5};
		//Stream<int[]> stream = Stream.of(arr2);
//		stream.flatMapToInt(a -> Arrays.stream(a)).
//				forEach(System.out::println);
//		
//		Arrays.stream(arr2).forEach(System.out::println);
       // int[][] deepArrayInt = new int[][]{{1, 3, 5, 7, 9}, {2, 4, 6, 8, 10}};
        //System.out.println(Arrays.deepToString(deepArrayInt));
		Stream<int[]> stream = Stream.of(arr2); 
		  
        // Displaying elements in Stream 
        stream.forEach(str -> System.out.print(str + " ")); 
        
        char arr1[] = { '1', '2', '3', '4', '5' }; 
        
        // --------- Using Stream.of() --------- 
        // Will work efficiently 
  
        // to convert int array into Stream 
        Stream<char[]> stream1 = Stream.of(arr1); 
  
        // Displaying elements in Stream 
        //.map(a -> )forEach(str -> System.out.print(str + " "));


		
	}

}
