package Conditional_Statements;

public class Homework_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int science = 60;
		int maths = 25;
		int english = 30;
		int Total = science + maths + english;
		float Average = Total/3f;
		System.out.println("Total Marks are " + Total);
		System.out.println("Average is " + Average);
		if (Average>=90 && Average<=100) {
			System.out.println("Grade A+");
			System.out.println("Excellent Performance!");
		}
		else if (Average>=75 && Average<=89) {
			System.out.println("Grade A");
			System.out.println("Excellent Performance!");
		}
		else if (Average>=60 && Average<=74) {
			System.out.println("Grade B");
			System.out.println("Keep improving");
		}
		else if (Average>=40 && Average<=59) {
			System.out.println("Grade C");
			System.out.println("Keep improving");
	}
		else {
		System.out.println("Fail");
		System.out.println("Please work harder next time.");
	}


	if (science < 35 || maths < 35 || english < 35 ); {
		System.out.println("Failed due to low score in at least one subject.");
	}
	}
}
 			
 	
