package hw2;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console  = new Scanner(System.in);
		System.out.print("How many numbers? ");
		int num = console.nextInt();
		int sum = 0;
		for (int i = 1; i<= num; i++) {
			System.out.print("Number " + i + " = ");
			 int number = console.nextInt();
			 sum+=number;
		}
		double average = (double) sum / num;
		System.out.println();
		System.out.println("Average = " + average );

	}

}
