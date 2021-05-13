package com.oops;

import java.lang.reflect.Constructor;

public class CreateObjMultipleWays {
	String name = "Rashi";

	public static void main(String[] args) {
		// By using new Keyword
		// CreateObjMultipleWays c=new CreateObjMultipleWays();
		/*
		 * try { //By using Instance Method
		 *  CreateObjMultipleWays c
		 *=CreateObjMultipleWays.class.newInstance(); System.out.println(c.name); }
		 * catch(Exception e) { e.printStackTrace(); }
		 */

//By using Constructor
		try {
			Constructor<CreateObjMultipleWays> obj = CreateObjMultipleWays.class.getConstructor();
			CreateObjMultipleWays c = obj.newInstance();
			System.out.println(c.name);
		} catch (Exception e) {
			e.printStackTrace();

		}
//By using clone Method 
		
		
		

	}

}
