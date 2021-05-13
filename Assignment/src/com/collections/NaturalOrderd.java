package com.collections;

import java.util.ArrayList;
import java.util.List;

public class NaturalOrderd {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("aello");
		names.add("hii");
		names.add("welcome");
		names.stream().sorted().forEach(System.out::println);
	}

}
