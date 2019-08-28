package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Establish count of number of items in bought
		
		int itemCount = scan.nextInt();
		
		String[] items = new String[itemCount];
		double[] prices = new double[itemCount];
		
		// for loop to two populate two arrays containing the
		// names and prices of the items
		
		for (int i=0; i<itemCount; i++) {
			items[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		
		// Establish count of people making purchases
		// and declare and initialize arrays that will
		// contain the first names, last names, and 
		// total amounts spent by the customers individually
		
		int peopleCount = scan.nextInt();
		String[] firstName = new String[peopleCount];
		String[] lastName = new String[peopleCount];
		double[] totalSpent = new double[peopleCount];
		
		// Assigning values to above arrays whose
		// indices correspond to the same customer
		
		for (int i=0; i<peopleCount; i++) {
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			
			// Number of unique items bought by a customer
			int uniqItems = scan.nextInt();
			
			for (int j=0; j<uniqItems; j++) {
				totalSpent[i] += scan.nextInt() * totalPrice(scan.next(), items, prices); 				
			}
		}
		
		// Maximum, minimum, and average of the total amount
		// spent by each customer
		double max = max(totalSpent);
		double min = min(totalSpent);
		double average = average(totalSpent);
		
		scan.close();
		
		// for loop to relate the obtained maximum value to the corresponding
		// first name and last name through matching indices and printing result
		for (int i=0; i<totalSpent.length; i++) {
			if (totalSpent[i] == max) {
				System.out.println("Biggest: " + firstName[i] + " " + lastName[i] + " "
				+ "("  + String.format("%.2f", max) + ")");
			}
		}
		
		// for loop to relate the obtained minimum value to the corresponding
		// first name and last name through matching indices and print result
		for (int i=0; i<totalSpent.length; i++) {
			if (totalSpent[i] == min) {
				System.out.println("Smallest: " + firstName[i] + " " + lastName[i] + " " 
				+ "(" + String.format("%.2f", min) + ")");
			}
		}
		
		// Print average of the total amounts spent 
		System.out.println("Average: " + String.format("%.2f", average));
		
		
	}
	
	// Helper method that returns the amount spent by a customer
	public static double totalPrice (String item, String[] itemList, double[] priceList) {
		for (int i=0; i<priceList.length; i++) {
			if (itemList[i].equals(item)) {
				return priceList[i];
			}
		}
		return 0;		
	}
	
	//Helper method that returns the maximum amount when given
	// an array of doubles
	public static double max (double[] values) {
		double max = 0;
		for (int i =0; i<values.length; i++) {
			if (values[i] > max) {
				max = values[i];
			}
		}
		
		return max;
	}
	
	//Helper method that returns the maximum amount when given
	// an array of doubles	
	public static double min (double[] values) {
		double min = values[0];
		for (int i =0; i<values.length; i++) {
			if (values[i] < min) {
				min = values[i];
			}
		}
		
		return min;
	}
	
	// Helper method that returns the average of 
	// an array of doubles
	public static double average (double[] values) {
		double average = 0;
		for (int i=0; i<values.length; i++) {
			average += values[i];
		}
		return average / values.length;
	}
	
}
