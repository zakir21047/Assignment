package com.oops;

public class TestStudentFee {

	public static void main(String[] args) {
		StudentFee s = new StudentFee();
		System.out.println(s.displayDetails());
		Hosteler h = new Hosteler(2, "ramya", 1200.0, 1020.00);
		System.out.println(h.displayDetails());
		System.out.println(h.payFee(100.00));
		DayScholar d = new DayScholar(3, "rasheeda", 200.00, 2300.00);
		System.out.println(d.displayDetails());
		System.out.println(d.payFee(50.0));

	}

}
