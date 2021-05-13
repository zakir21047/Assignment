package com.oops;

import java.util.Scanner;

public class TestAbstractStudent {


	public static void main(String[] args) {
		TestAbstractStudent t= new TestAbstractStudent();
		ScienceStudent s= new ScienceStudent(45,35,46);
		Scanner sc=new Scanner(System.in);
		s.getPercentage();
		HistoryStudent h=new HistoryStudent(45,67);
		h.getPercentage();

	}

}
