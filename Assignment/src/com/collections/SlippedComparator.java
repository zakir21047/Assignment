package com.collections;

import java.util.LinkedList;
import java.util.function.BiPredicate;

public class SlippedComparator {

	public static void main(String[] args) {
		BiPredicate<Integer,Integer> p=(a,b)->(a+b)%2==0;
		System.out.println();
	}

}
