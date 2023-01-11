package performance_task;

import java.util.Scanner;

public class Performance_Task {

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);
		
		// Asks user for launch velocity and launch angle.
		System.out.println("Enter launch velocity (m/s) >>> ");
		double velocity = inKey.nextDouble();
		System.out.println("Enter launch angle (degrees) >>> ");
		double angle = inKey.nextDouble();
		
		// Beginning of the projectile's path stats.
		System.out.println("\nProjectile's path: \n");
		
		// Variables for time, x-position, and y-position.
		int time = 0;
		double x = 0;
		double y = 0;
		
		// Prints the stats (time, location, etc) in a loop until y-pos is zero.
		do {
			System.out.println("Time: " + time + "s");
			
			// Calculates the x-pos and y-pos.
			x = Math.cos(Math.toRadians(angle)) * time * velocity;
			y = Math.sin(Math.toRadians(angle)) * time * velocity - 0.5 * 9.8 * Math.pow(time, 2);
			
			if (y < 0) {
				break;
			}
			
			System.out.println("\tx-pos: " + x + "m");
			System.out.println("\ty-pos: " + y + "m");
			
			// Increments the time.
			time++;
			
				
		} while (y >= 0);
		
		// Prints the final x-pos when y-pos is zero.
		System.out.println("\tx-pos: " + x + "m");
		System.out.println("\ty-pos: 0m");
		
	}
	
}
