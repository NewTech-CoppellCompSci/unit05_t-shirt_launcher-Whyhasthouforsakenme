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


	public static void problem3() {
		
		
	}

	
	
	public static void problem4() {
		
		
	}



}
