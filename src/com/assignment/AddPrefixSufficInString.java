package com.assignment;
import java.util.*;

public class AddPrefixSufficInString {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("apple");
		strings.add("banana");
		strings.add("orange");

		String prefix = "fruit_";
		String suffix = "_fruit";

		List<String> modifiedStrings = new ArrayList<>();

		for (String str : strings) {
			String modifiedStr = prefix + str + suffix;
			modifiedStrings.add(modifiedStr);
		}

		System.out.println("Original strings: " + strings);
		System.out.println("Modified strings: " + modifiedStrings);
	}

}
