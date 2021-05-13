package Assignment;

import java.util.Scanner;

public class EmpSalary {
	double salary;

	public static void main(String[] args) {
		int i, total = 0;
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter the salary");
		int[] array = new int[size];

		for (i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		try {
			for (i = 0; i < size; i++) {
				total += array[i];

			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Enetr the elements given size only");
			System.exit(0);
		}
		int average = total / size;
		System.out.println(average + "Is the average salary");

	}
}
