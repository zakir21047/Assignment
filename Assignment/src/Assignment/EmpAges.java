package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmpAges {
	int empNo;
	int age;
	
	@Override
	public String toString() {
		return "EmpAges [empNo=" + empNo + ", age=" + age + "]";
	}

	public EmpAges(int empNo, int age) {
		super();
		this.empNo = empNo;
		this.age = age;
	}

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Employee Size");
	EmpAges[] e = null;
	try {
		e=new EmpAges[sc.nextInt()];
	}
	catch (NegativeArraySizeException nase){
		System.out.println("NegativeArraySizeException");
		System.exit(0);
		//nase.printStackTrace();
	}
	System.out.println("Enter"+e.length+"Employee info");
	for(int i=0;i<e.length;i++) {
	System.out.println("Enter"+(i+1)+"employee no,age");
			e[i]=new EmpAges(sc.nextInt(),sc.nextInt());
		}
	
	int max=e[0].age;
	for(int i=1;i<e.length;i++) {
		if(max < e[i].age)
		{
			max=e[i].age;
		}
		System.out.println(max);
	}

}
}
