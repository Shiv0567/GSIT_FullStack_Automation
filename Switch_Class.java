package Conditional_Statements;

public class Switch_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 2;
		
		switch(choice) {
		case 1: 
			System.out.println("The color is red");
			break;
			
		case 2:
			System.out.println("The color is blue");
			break;
			
		case 3:
			System.out.println("The color is yellow");
			break;
		
		case 4:
			System.out.println("The color is orange");
			break;
			
		case 5:
			System.out.println("The color is magenta");
			break;
		
		default:
			System.out.println("Invalid input");
		}
	}

}
