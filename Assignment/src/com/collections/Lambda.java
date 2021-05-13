package com.collections;

public class Lambda {
public static void main(String[] args) {
	MyInterface myinterface= (a,b)->(a+b);
	int output = myinterface.sumMethod(20,30);
	System.out.println(output);
}
}
