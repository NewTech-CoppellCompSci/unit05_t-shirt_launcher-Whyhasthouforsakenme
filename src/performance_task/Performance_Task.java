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
		
		System.out.println("\nProjectile's path: \n");
		
		int time = 0;
		double x = 0;
		double y = 0;
		
		do {
			System.out.println("Time: " + time + "s");
			
			x = Math.cos(Math.toRadians(angle)) * time * velocity;
			y = Math.sin(Math.toRadians(angle)) * time * velocity - 0.5 * 9.8 * Math.pow(time, 2);
			
			if (y < 0) {
				break;
			}
			
			System.out.println("\tx-pos: " + x + "m");
			System.out.println("\ty-pos: " + y + "m");
			
			time++;
			
				
		} while (y >= 0);
		
		System.out.println("\tx-pos: " + x + "m");
		System.out.println("\ty-pos: 0m");
		
		
		/** for (int i = 0; i < 3; i++) {
			System.out.println("Time: " + time + "s");
			
			x = Math.cos(Math.toRadians(angle)) * time * velocity;
			System.out.println("\tx-pos: " + x + "m");
			y = Math.sin(Math.toRadians(angle)) * time * velocity - 0.5 * 9.8 * Math.pow(time, 2);
			System.out.println("\ty-pos: " + y + "m");
			
			time++;
		}
		**/
	}
	
}
