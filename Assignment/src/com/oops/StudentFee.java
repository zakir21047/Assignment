package com.oops;

public class StudentFee {
		int sid;
		String name;
		double examFee;

		StudentFee() {
			System.out.println("default constructor");
		}

		StudentFee(int sid, String name, double examFee) {
			this.sid = sid;
			this.name = name;
			this.examFee = examFee;
		}

		public String displayDetails() {
			return "NewStudent [sid=" + sid + ", name=" + name + ", examFee=" + examFee + "]";
		}
	}

	class DayScholar extends StudentFee {
		double transportFee;

		DayScholar() {
			System.out.println("Days Scholar Default Constructure");
		}

		DayScholar(int sid, String name, double examFee, double transportFee) {
			super(sid, name, examFee);
			this.transportFee = transportFee;
		}

		public String displayDetails() {
			return "DayScholar [transportFee=" + transportFee + ", sid=" + sid + ", name=" + name + ", examFee="
					+ examFee + "]";
		}

		public double payFee(double amount) {
			if (amount < (transportFee + examFee))
				return (transportFee + examFee) - amount;
			else {
				return amount - (transportFee + examFee);
			}
		}

	}

	class Hosteler extends StudentFee {
		double HostelFee;

		Hosteler() {
			System.out.println("Default Hosteler Constructure ");
		}

		Hosteler(int sid, String name, double examFee, double HostelFee) {
			super(sid, name, examFee);
			this.HostelFee = HostelFee;
		}

		public String displayDetails() {
			return "Hosteller [HostelFee=" + HostelFee + ", sid=" + sid + ", name=" + name + ", examFee=" + examFee
					+ "]";
		}

		public double payFee(double amount){
			if(amount<(HostelFee+examFee))
				return (HostelFee+examFee)-amount;
				else{
		         return amount-(HostelFee+examFee);
				}
	}

}
