package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {

		problem1();
		problem2();
		problem3();
		problem4();

	}

	// Asks the user for two positive integers. Then prints 100 random numbers between them.
	public static void problem1() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int firstInt = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int secInt = inKey.nextInt();
		
		int max = Math.max(firstInt, secInt);
		int min = Math.min(firstInt, secInt);
		
		for (int i = 0; i < 100; i++) {
			System.out.print(((int)(Math.random() * (max - min + 1)) + min) + " ");
		}
	}

	// Asks the user for the radius and height of a cylinder. Then prints out the volume.
	public static void problem2() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.println("\n\nEnter the cylinder's radius: ");
		double radius = inKey.nextDouble();
		System.out.println("Enter the cylinder's height: ");
		double height = inKey.nextDouble();
		
		double cylVol =  Math.PI * Math.pow(radius, 2) * height;
		
		System.out.print("Enter the cylinder's volume: " + cylVol);
		
	}

	// Asks the user for the coordinates of two points. Then prints the distance between these points.
	public static void problem3() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.println("\n\nEnter x1: ");
		double x1 = inKey.nextDouble();
		System.out.println("Enter y1: ");
		double y1 = inKey.nextDouble();
		System.out.println("Enter x2: ");
		double x2 = inKey.nextDouble();
		System.out.println("Enter y2: ");
		double y2 = inKey.nextDouble();
		
		double distance =  Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		System.out.println("Distance between points = " + distance);
	}

	
	/* Asks the user for a, b, and c values in the quadratic formula.
	 * Then prints both x-intercepts.
	 */
	public static void problem4() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.println("\n\nEnter a-value: ");
		double a = inKey.nextDouble();
		System.out.println("Enter b-value: ");
		double b = inKey.nextDouble();
		System.out.println("Enter c-value: ");
		double c = inKey.nextDouble();
		
		double plus = -b+Math.sqrt(Math.pow(b, 2)-4*a*c)/(2*a);
		System.out.println("x1 = " + plus);
		double minus = -b-Math.sqrt(Math.pow(b, 2)-4*a*c)/(2*a);
		System.out.println("x2 = " + minus);
	}



}
