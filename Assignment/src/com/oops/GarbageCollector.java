package com.oops;

public class GarbageCollector {
	public void finalize() {
		System.out.println("Obj is destroyed");
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		GarbageCollector g=new GarbageCollector();
		GarbageCollector g1=new GarbageCollector();
		g=null;
		g1=null;
		System.gc();
	}

}
