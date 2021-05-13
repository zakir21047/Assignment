package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {
	public static int empId;
	public static String empName;
	public static double salary;
	
	public static void main(String[] args) {
		Employee e =new Employee();
		ArrayList<String> a= new ArrayList<String>();
		a.add("1");
		a.add("Rasheeda");
		a.add("50000");
		Iterator<String> i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	for(String e1:a) {
		System.out.println(e1);
	}
}
}
