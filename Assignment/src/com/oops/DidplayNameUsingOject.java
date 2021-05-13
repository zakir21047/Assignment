package com.oops;

public class DidplayNameUsingOject {
	int sno;
	String sname;
	void accept(int no,String name) {
		sno =no;
		sname= name;
		
	}
	void  display() {
		System.out.println("No:"+ sno);
		System.out.println("Name:"+sname);
		
	}
	public static void main(String[] args) {
		 DidplayNameUsingOject  d=new  DidplayNameUsingOject ();
		 d.accept(10, "rasheeda");
		 d.display();
		 DidplayNameUsingOject  d1=new  DidplayNameUsingOject ();
		 d.accept(11, "Rashee");
		 d.display();
		 DidplayNameUsingOject  d2= d;
	}
}
