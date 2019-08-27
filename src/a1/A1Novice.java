package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Read in count of people to be processed
		
		int count = scan.nextInt();
		
		
		// Create arrays for first name initial, 
		// Last name, and total amount spent by each person.
	
		
		char[] initials = new char[count];
		String[] lastName = new String[count];
		double[] totalCost = new double[count];
		
		// for loop to go through each entry
		
		for (int i=0; i<count; i++) {
			
			// Store value of first name
			
			String name = scan.next();
			
			// Add first initial to initials array
			
			initials[i] = name.charAt(0);
			
			//Add last name to array
			
			lastName[i] = scan.next();
			
			// Read in amount of different items and initialize cost variable
			// To be used in for loop
			
			int diffItems = scan.nextInt(); 
			double cost = 0;
			
			// for loop to find total of all purchases using findSum method
			for (int j=0; j<diffItems; j++) {
				cost += findSum(scan.nextInt(), scan.next(), scan.nextDouble());
			}
			
			totalCost[i] = cost;
			
		}
		
		scan.close();
		
		// Printing information as F. Last: Total
		// Total cost formatted to include two decimal places
		for(int l=0; l<count; l++) {
			System.out.println(initials[l] + ". " + lastName[l] + ": " + 
			String.format("%.2f", totalCost[l]));		
		}
	}

		
	
	// Helper method to find sum of each transaction
	
	static double findSum(int items, String itemName, double price) {
		
		double total = items*price;
		return total;
		
	}
}
