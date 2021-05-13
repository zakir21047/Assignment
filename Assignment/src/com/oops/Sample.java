package com.oops;

class Demo implements Cloneable {
	static Demo obj=null;
	
	Demo() {
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
public class Sample {
public static void main(String[] args) throws CloneNotSupportedException{
		Demo obj=Demo.getInstance();
		obj.disp();
		Demo obj1=Demo.getInstance();
		try {
			Demo obj2=(Demo)obj.clone();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		
		}

	}

}

	

