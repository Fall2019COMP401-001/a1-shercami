package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Establish number of unique items available for purchase
		// and arrays for items and prices
		
		int itemCount = scan.nextInt();
		String[] items = new String[itemCount];
		double[] prices = new double[itemCount];
		
		// Fill items and prices arrays
		for (int i=0; i<itemCount; i++) {
			items[i] = scan.next();
			prices[i] = scan.nextDouble();
			
		}
		
		// Establish number of customers making purchases
		int customers = scan.nextInt();
		int[][] purchases = new int[itemCount][customers];
		
		for (int i=0; i<customers; i++) {
			
			// Variables to store first and last name inputs
			String first = scan.next();
			String last = scan.next();
			
			int ind_Items = scan.nextInt();
			
			// for loop to populate purchases array
			for (int j=0; j<ind_Items; j++) {
				populate(scan.nextInt(), scan.next(), purchases, items, i);
				}
			}
		
		scan.close();
		
		// Print the total quantity purchased of each individual item
		for (int i=0; i<itemCount; i++) {
			int itemTotal = 0;
			int custBought = 0;
			for (int j=0; j<purchases[0].length; j++) {
				itemTotal += purchases[i][j];
				if (purchases[i][j] > 0) {
					custBought++;
				}
			}
			if (itemTotal == 0) {
				System.out.println("No customers bought " + items[i]);
			} else {
				System.out.println(custBought + " customers bought " + itemTotal + " " + items[i]);
			}
		}
	}
	
public static void populate (int quantity, String item, int[][] toFill, String[] items, int column) {
		for (int i=0; i<items.length; i++) {
			if (items[i].equals(item)) {
				toFill[i][column] = quantity;
			}
	}
}

}
