package com.oops;

public class CloneMethod implements Cloneable{

	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	String name="Rasheeda";
	public static void main(String[] args) {
		CloneMethod c= new CloneMethod();
		try
		{
			CloneMethod c1=  (CloneMethod) c.clone();
			System.out.println(c.name);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
