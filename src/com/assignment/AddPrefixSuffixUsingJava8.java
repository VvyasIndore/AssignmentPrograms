package com.assignment;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddPrefixSuffixUsingJava8 {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "orange");

		List<String> modifiedStrings = strings.stream().map(str -> "Prefix_" + str + "_Suffix")
				.collect(Collectors.toList());

		System.out.println(modifiedStrings);
	}

}
