package com.collections;

import java.util.stream.Stream;

public class Exapmle {

	public static void main(String[] args) {
		Stream<Integer>streamOfNumbers=Stream.of(5,2,3,4,4);
		System.out.println(streamOfNumbers.count());
	}

}
