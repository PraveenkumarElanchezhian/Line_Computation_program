package OOPS_Practice_problem;
import java.util.Scanner;
public class Line_comparison {
public static void main(String[] args) {
	lengthTwo rv = new lengthTwo();
	double length_one = rv.length_2();
	double length_two = rv.length_1();
		int a = Double.compare(length_one, length_two);
		if (a == 0) {System.out.println("Length_one and Length_two are equal");}
		else if (a == 0) {System.out.println("Length_one is greater than Length_two");}
		else {System.out.println("Length_one is less than Length_two");}
 }
}
	 class lengthOne {
	 double length_1() {
	 Scanner user_input = new Scanner(System.in);
	 System.out.println("Enter the value of x1: ");
	 double x1 = user_input.nextDouble();
	 System.out.println("Enter the value of y1: ");
	 double y1 = user_input.nextDouble();
	 System.out.println("Enter the value of x2: ");
	 double x2 = user_input.nextDouble();
	 System.out.println("Enter the value of y2: ");
	 double y2 = user_input.nextDouble();
	 
	 double length_one = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("Distance between two points :" + length_one);
		return length_one;
 }
	}
	 class lengthTwo extends lengthOne {
	 double length_2() {
	 Scanner user_input = new Scanner(System.in);
	 System.out.println("Enter the value of x1: ");
	 double x1 = user_input.nextDouble();
	 System.out.println("Enter the value of y1: ");
	 double y1 = user_input.nextDouble();
	 System.out.println("Enter the value of x2: ");
	 double x2 = user_input.nextDouble();
	 System.out.println("Enter the value of y2: ");
	 double y2 = user_input.nextDouble();
	 
	 double length_two = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("Distance between two points :" + length_two);
		return length_two;
 }
	 }

