package com.assignment;
import java.util.*;
import java.util.stream.Stream;

public class ConcatTwoStream {

	public static void main(String[] args) {
		// Create two example streams
		List<Integer> stream1Data = Arrays.asList(1, 2, 3);
		List<Integer> stream2Data = Arrays.asList(4, 5, 6);

		Stream<Integer> stream1 = stream1Data.stream();
		Stream<Integer> stream2 = stream2Data.stream();

		// Concatenate the two streams
		Stream<Integer> concatenatedStream = Stream.concat(stream1, stream2);

		// Print the elements of the concatenated stream
		concatenatedStream.forEach(System.out::println);
	}

}
