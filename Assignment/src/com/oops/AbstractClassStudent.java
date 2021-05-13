package com.oops;

public abstract class AbstractClassStudent {

	String studentName;
	String studentClass;
	protected static int totalNoOfStudents;

	abstract void getPercentage();

	static void totalNo_Of_Student() {

	}

	AbstractClassStudent() {
		System.out.println("Default Constructure");
	}

	public AbstractClassStudent(String studentName, String studentClass) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
	}

	@Override
	public String toString() {
		return "StudentAbstractClass [studentName=" + studentName + ", studentClass=" + studentClass + "]";
	}

}

class ScienceStudent extends AbstractClassStudent {
	int percentage;
	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;

	public ScienceStudent( int physicsMarks, int chemistryMarks, int mathsMarks) {
		super();
	
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

	@Override
	void getPercentage() {
		int total = (physicsMarks + chemistryMarks + mathsMarks);

		percentage = (total / 3) ;
		System.out.println(percentage  + "Science marks");

	}
}

class HistoryStudent extends AbstractClassStudent {
	//int percentage;
	int historyMarks;
	int civicsMarks;
	@Override
	
	void getPercentage() {
		int total = (historyMarks + civicsMarks);
		int percentage = (total / 2) ;
		System.out.println(percentage + "Historymarks");
	}
	public HistoryStudent(int historyMarks, int civicsMarks) {
		super();
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;

	}

}
