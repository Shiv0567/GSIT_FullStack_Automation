package Methods;

import java.util.Scanner;

public class Scanner_Hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter your Product : " );
		String Product = sc.nextLine();
		System.out.print("Enter your quantity : "); // float, double, boolean, String values
		int quantity = sc.nextInt();
		System.out.print("Enter Your stock : " );
		float stock = sc.nextFloat();
		System.out.print("Enter your avgcost : " );
		double avgcost = sc.nextDouble();
		//shSystem.out.println("Stock available : ");
		//boolean available = sc.nextBoolean();
		System.out.println("Your Inputs are : " );
		System.out.println("String - " + Product);
		System.out.println("Integer - "+ quantity); 
		System.out.println("float - "+ stock);
		System.out.println("double - "+avgcost);
		//System.out.println("boolean "+available);
		
		double Finalcost = (quantity * avgcost );
		System.out.println("The final cost is "+ Finalcost);
		int total = quantity + 10 ;
		System.out.println("Available for you : "+ total);
		float discount = (float)(quantity / avgcost *stock);
		System.out.println("Discount : "+ discount);
		sc.close();
		
	}
	

}



