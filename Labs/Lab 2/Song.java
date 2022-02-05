// Linh Nguyen Section 2
// Date
// Assignment 2 Get you a cat
// Print the American folk song with 6 different verses

package song;

import java.io.*;

public class Song {
	public static void main(String[] args) {
		System.out.println("Bought me a cat and the cat pleased me,");
		System.out.println("I fed my cat under yonder tree.");
		cat();
		System.out.println();
		
		System.out.println("Bought me a hen and the hen pleased me,");
		System.out.println("I fed my hen under yonder tree.");
		hen();
		cat();
		System.out.println();
		
		System.out.println("Bought me a duck and the duck pleased me,");
		System.out.println("I fed my duck under yonder tree.");
		duck();
		hen();
		cat();
		System.out.println();
		
		System.out.println("Bought me a goose and the goose pleased me,");
		System.out.println("I fed my goose under yonder tree.");
		goose();
		duck();
		hen();
		cat();
		System.out.println();
		
		System.out.println("Bought me a sheep and the sheep pleased me,");
		System.out.println("I fed my sheep under yonder tree.");
		sheep();
		goose();
		duck();
		hen();
		cat();
		System.out.println();
		
		System.out.println("Bought me a pig and the pig pleased me,");
		System.out.println("I fed my pig under yonder tree.");
		pig();
		sheep();
		goose();
		duck();
		hen();
		cat();
	}
	
	public static void cat() {
		System.out.println("Cat goes fiddle-i-fee.");
	}
	
	public static void hen() {
		System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
	}
	
	public static void duck() {
		System.out.println("Duck goes quack, quack,");
	}
	
	public static void goose() {
		System.out.println("Goose goes hissy, hissy,");
	}
	
	public static void sheep() {
		System.out.println("Sheep goes baa, baa,");
	}
	
	public static void pig() {
		System.out.println("Pig goes oink, oink");
	}
}
