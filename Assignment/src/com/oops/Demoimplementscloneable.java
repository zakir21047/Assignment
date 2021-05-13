package com.oops;

public class Demoimplementscloneable {
	static Demo obj=null;
	private void Demo() {
		System.out.println("Default constructor");
	}
	void disp() {
		System.out.println("welcome");
	}
	public static Demo getInstance() {
		if(obj==null) {
			obj=new Demo();
		}
		return obj;
	}
	public Object clone() throws java.lang.CloneNotSupportedException {
		throw new java.lang.CloneNotSupportedException("not able to create an object");
	}
}


	