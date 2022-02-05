// Linh Nguyen Section 2
// Date Tuesday Feb 8, 2022
// The below program prompts users to input homework, exam 1
// and exam 2 categories respectively to calculate the weighted average.

package grades;

// Import Scanner package
import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		
		System.out.println("This program accepts your homework and two exam scores\nas input and computes your grade in the course.");
		
		// Create Scanner to prompt inputs
		Scanner grab = new Scanner(System.in);
		
		// Prompt inputs
		System.out.print("Homework weight? ");
		final int hw_weight = grab.nextInt();
		
		System.out.print("Exam 1 weight? ");
		final int exam1_weight = grab.nextInt();
		
		final int exam2_weight = 100 - hw_weight - exam1_weight;
		
		System.out.printf("Using weights of: %n%d for Homework %n%d for Exam 1 %n%d for Exam 2 %n", hw_weight, exam1_weight, exam2_weight);
		
		// Homework
		System.out.println("\nHomework: ");
	
		System.out.print("Number of assignments? ");
		int number_of_asm = grab.nextInt();
		
		System.out.print("Average Homework grade? ");
		double avg_hw_grade = grab.nextDouble();
		
		System.out.print("Number of late days used? ");
		int late_days = grab.nextInt();
		
		System.out.print("Labs attended? ");
		int labs_attended = grab.nextInt();
		
		// Calculate
		int max_hw_score = number_of_asm * (10 + 4); // 10 per assignment and 4 per lab and assignments = labs
		
		double hw_score = homework(avg_hw_grade, labs_attended, late_days, number_of_asm); // Assign return values
		
		System.out.printf("Total points = %.2f / %d %n", hw_score, max_hw_score);
		
		double hw_weighted = hw_weight * hw_score / max_hw_score;
		
		System.out.printf("Weighted score = %.2f %n", hw_weighted);
		
		// Exam 1
		System.out.println("\nExam 1: ");
		
		System.out.print("Score? ");
		double exam1_score = grab.nextDouble();
		
		if (exam1_score <= 0) {
			exam1_score = 0;
		} else if (exam1_score > 100) {
			exam1_score = 100;
		}
		
		System.out.print("Curve? ");
		final double curve1 = grab.nextDouble();
		
		double exam1_curved = exam1_score + curve1;
		
		if (exam1_curved > 100) {
			exam1_curved = 100;
		} else if (exam1_curved <= 0) {
			exam1_curved = 0;
		}
		
		double exam1_weighted = exam1(exam1_curved, exam1_weight); // Assign return values
		
		System.out.printf("Total points = %.2f / 100 %n", exam1_curved);
		
		System.out.printf("Weighted score = %.2f %n", exam1_weighted);
		
		// Exam 2
		System.out.println("\nExam 2: ");
		System.out.print("Score? ");
		double exam2_score = grab.nextDouble();
		
		if (exam2_score <= 0) {
			exam2_score = 0;
		} else if (exam2_score > 100) {
			exam2_score = 100;
		}
		
		System.out.print("Curve? ");
		final double curve2 = grab.nextDouble();
		
		double exam2_curved = exam2_score + curve2;
		
		if (exam2_curved > 100) {
			exam2_curved = 100;
		} else if (exam2_curved <= 0) {
			exam2_curved = 0;
		}
		
		double exam2_weighted = exam2(exam2_curved, exam2_weight); // Assign return values
		
		System.out.printf("Total points = %.2f / 100 %n", exam2_curved);
		
		System.out.printf("Weighted score = %.2f %n", exam2_weighted);
		
		// Final average point
		double course_grade = hw_weighted + exam1_weighted + exam2_weighted;
		
		System.out.printf("%nCourse grade = %.2f", course_grade);
	}
	
	// 1st function
	private static double homework(double avg_hw_grade, int labs_attended, int late_days, int number_of_asm) {
		
		double hw_total = number_of_asm * avg_hw_grade + labs_attended * 4;
		
		int max_hw_score = number_of_asm * (10 + 4); // 10 per assignment and 4 per lab and assignments = labs

		if (avg_hw_grade <= 0) {
			avg_hw_grade = 0;
		} else if (avg_hw_grade > 10) {
			avg_hw_grade = 10;
		}
		
		if (labs_attended <= 0) {
			labs_attended = 0;
		} else if (labs_attended > number_of_asm) {
			labs_attended = number_of_asm;
		}
		
		if (late_days > number_of_asm / 2) {
			hw_total *= 0.9;  // Reduce by 10% of total hw_total
		} else if (late_days == 0) {
			hw_total += 5;
			if (hw_total > max_hw_score) {
				hw_total = max_hw_score;
			}
		}
				
		return hw_total;
	}
	
	// 2nd function
	private static double exam1(double exam1_curved, int exam1_weight) {
		double exam1_weighted = exam1_weight * exam1_curved / 100;
		return exam1_weighted;
	}
	
	// 3rd function
	private static double exam2(double exam2_curved, int exam2_weight) {
		double exam2_weighted = exam2_weight * exam2_curved / 100;
		return exam2_weighted;
	}
}
