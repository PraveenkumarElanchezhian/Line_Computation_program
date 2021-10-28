package OOPS_Practice_problem;
import java.util.Scanner;
public class Line_comparison {
public static void main(String[] args) {
	Line_comparison rv = new Line_comparison();
	rv.length();
 }
 void length() {
	 Scanner user_input = new Scanner(System.in);
	 System.out.println("Enter the value of x1: ");
	 double x1 = user_input.nextDouble();
	 System.out.println("Enter the value of y1: ");
	 double y1 = user_input.nextDouble();
	 System.out.println("Enter the value of x2: ");
	 double x2 = user_input.nextDouble();
	 System.out.println("Enter the value of y2: ");
	 double y2 = user_input.nextDouble();
	 
	 double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("Distance between two points :" + length);
 }
}
