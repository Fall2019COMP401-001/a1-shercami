package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Read in count of people to process
		
		int count = scan.nextInt();
		
		//Create an array to store numbers
		
		int[] values = new int[count];
		
		/* Create arrays for first initial, 
		 * Last name, and total cost.
		 */
		
		char[] initials = new char[count];
		String[] lastName = new String[count];
		double[] totalCost = new double[count];
		
		// for loop to go through each entry
		
		for (int i=0; i<values.length; i++) {
			
			// Store value of first name
			String name = scan.next();
			
			// Add first initial to initials array
			
			initials[i] = name.charAt(0);
			
			//Add last name to array
			
			lastName[i] = scan.next();
			
			int diffItems = scan.nextInt();
		
			double cost = 0;
			
			for (int j=0; j<diffItems; j++) {
				cost += findSum(scan.nextInt(), scan.next(), scan.nextDouble());
			}
			
			totalCost[i] = cost;
			
		}
		
		scan.close();
		
		for(int l=0; l<values.length; l++) {
			System.out.println(initials[l] + ". " + lastName[l] + ": " + totalCost[l]);		
		}
	}

		
	
	// Helper method to find sum of each transaction
	
	static double findSum(int items, String itemName, double price) {
		

		
		double total = items*price;
		
		
		return total;
		
	}
}
