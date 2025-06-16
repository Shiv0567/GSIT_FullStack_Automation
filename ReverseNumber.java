package Conditional_Statements;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num = 455674;
		int Rev = 0 ;
		while(Num!= 0) 
		{
			int Digit = Num%10; // Reads the last digit
			Rev = Rev * 10 + Digit;
			Num = Num/10; //Removes the last digit 
		}
		System.out.println("The Reversed Num is " + Rev);
	}

}
