// Linh Nguyen Section 2
// Date Tuesday 02/01/2022
// Assignment 3 - Draw a pretty picture
// Use nested for loops to draw out 3 patterns with special symbols
// Basic shape, Parking Lot & Lincoln Stadium

package AsciiArt;

import java.lang.Math;

public class AsciiArt {
	
	// Class constant for basic figure
	static final int SIZE = 10;
	
	// Class constant for 2 extra credit patterns
	static final int SIZES = 4;
	
	// Class constant for the stadium's measurements
	static final int stadium_width = SIZES * 8 + 2;
	
	static final int stadium_length = SIZES * 4 + 2;
	
	// Loop sequence of the asterisks
	static final int asterisks = SIZES * 2; // 
	
	// Official program
	public static void main(String[] args) {
		shape(SIZE);
		parkingLot(SIZES);
		stadium();
	}
	
	// First - basic picture - doubly nested for loops
	static void shape(int n) {
		
		// Print the same number of rows as the size
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < 2; j++) {
				
				// If-else statements to print out the second straight line symbol with a new line
				if (j == 1) {
					System.out.println("|");
				} else {
					System.out.print("|");
					
					for (int k = 0; k < n; k++) {
						System.out.print("*");
					}
				}
			}
		}
	}
	
	// Second - Extra credit 1 - Parking Lot
	static void parkingLot(int n) {
		
		for (int i = 0; i < 1; i++) { // Line 1
			
			System.out.print(" ");
			
			for (int j = 0; j < Math.pow(2, n) + 1; j++) { // Underscores in Line 1
				
				System.out.print("_");
			}
			
			System.out.println();
		}
		
		// Loop for each row - Another doubly nested for loops
		for (int i = 0; i < Math.pow(2, n); i++) {
			
			// Loop for each box
			for (int j = 0; j < 2; j++) {
				
				System.out.print("|");
				
				for (int k = 0; k < Math.pow(2, n - 1); k++) {
					
					System.out.print("_");
				}
			}
			
			System.out.println("|");
		}
	}
	
	//Third - Extra credit 2 - Lincoln Stadium
	static void stadium() {
		top_border();
		top_half();
		bottom_half();
	}
	
	static void top_border() { // Line 1 with only underscores
		System.out.print(" ");
		
		for (int i = 0; i < stadium_width; i++) { // The number of asterisks = the length of the stadium
			
			System.out.print("_");
		}
		
		System.out.println();
	}
	
	static void top_half() { // Lines 2 - 10
		
		for (int n = 0; n < stadium_length / 2; n++) {
			
			System.out.print("|");
			
			if (n == 0) { // Condition for line 2
				top_line(n);
			} else if(n <= SIZES) { // Condition for lines 3 - 6
				top_dots(n);
			} else { // Condition for lines 7 - 10
				top_dots_asterisks(n);
			}
		}
	}
	
	static void top_line(int n) { // Line 2
		
		top_spaces(n);
		
		System.out.print("__");
		
		top_spaces(n);
		
		System.out.println("|");
	}
	
	static void top_dots(int n) { // Lines 3 - 6
		
		int dots = (n * 4) - 2; // Start with n = 1 from else if statement
		
		top_spaces(n);
		
		System.out.print("_/");
		
		for (int i = 0; i < dots; i++) {
			
			System.out.print(".");
		}
		
		System.out.print("\\_");
		
		top_spaces(n);
		
		System.out.println("|");
	}
	
	static void top_dots_asterisks(int n) { // Lines 7 - 10
		
		int dots = ((n * 4) - 2 - asterisks) / 2; // Start with n = 5 from else statement
		
		top_spaces(n);
		
		System.out.print("_/");
		
		for (int i = 0; i < dots; i++) {
			
			System.out.print(".");
		}
		
		asterisks();
		
		for (int i = 0; i < dots; i++) {
			
			System.out.print(".");
		}
		
		System.out.print("\\_");
		
		top_spaces(n);
		
		System.out.println("|");
	}
	
	// Loop for spaces in the top half in each line
	static void top_spaces(int n) {
		
		int spaces = (SIZES * 4) - (n * 2); // Start with n = 0 so line 2 has 16 spaces on each side
		
		for (int i = 0; i < spaces; i++) {
			
			System.out.print(" ");
		}
	}
	
	static void bottom_half() { // Lines 11 - 19
		
		for (int n = (stadium_length / 2) - 1; n >= 0; n--) {
			
			System.out.print("|");
			
			if (n == 0) { // Last line
				bottom_line(); 
			} else if(n <= SIZES) { // Condition for lines 15 - 17
				bottom_dots(n); 
			} else { // Condition for lines 11 - 14
				bottom_dots_asterisks(n);
			}
		}
	}
	
	// Last line with only underscores and 2 border lines
	static void bottom_line() { // Line 19
		
		for (int i = 0; i < stadium_width; i++) {
			
			System.out.print("_");
		}
		System.out.println("|");
	}
	
	static void bottom_dots(int n) { // Lines 15 - 17
		
		int dots = (n * 4) - 4;
		
		bottom_spaces(n);
		
		System.out.print("\\_");
		
		for (int i = 0; i < dots; i++) {
			
			System.out.print(".");
		}
		System.out.print("_/");
		
		bottom_spaces(n);
		
		System.out.println("|");
	}
	
	static void bottom_dots_asterisks(int n) { // Lines 11 - 14
		
		int dots = ((n * 4) - (4 + asterisks)) / 2; // Start with n = 8
		
		bottom_spaces(n);
		
		System.out.print("\\_");
		
		for (int i = 0; i < dots; i++) {
			
			System.out.print(".");
		}
		
		asterisks();
		
		for (int i = 0; i < dots; i++) {
			
			System.out.print(".");
		}
		
		System.out.print("_/");
		
		bottom_spaces(n);
		
		System.out.println("|");
	}
	
	static void bottom_spaces(int n) { // Loop for spaces in the bottom half in each line
		
		int spaces = (stadium_width / 2) - (n * 2);
		
		for (int i = 0; i < spaces; i++) {
			
			System.out.print(" ");
		}
	}
	
	static void asterisks() { // Print out asterisks in the middle
		
		for (int i = 0; i < asterisks; i++) {
			
			System.out.print("*");
		}
	}
}
