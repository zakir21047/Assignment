package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Streamslisi {
public static void main(String[] args) {
	List<String> names= new ArrayList<>();
	names.add("rash");
	names.add("rasheeda");
	names.add("vetapalem");
	names.add("Rashee");
	names.add("David");
	names.stream().filter((String name)->name.length()>5).skip(2).
	forEach(System.out::println);
	names.parallelStream().filter((String name)->name.length()>5).skip(2).forEach(System.out::println);
}
}
