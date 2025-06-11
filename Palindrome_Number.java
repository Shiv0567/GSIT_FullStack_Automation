package Conditional_Statements;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ognum = 121;
		int originaln = ognum;
		int revnum = 0; 
		while(ognum!=0) {
			int digit = ognum%10; // Read the last digit
			revnum = revnum * 10 + digit ;
			ognum = ognum/10; // Remove the last digit 
		}
		if(originaln == revnum) {
		  System.out.println("The given number is palindrome " + originaln);
			} 
		else 
		{
				System.out.println("The given number is not palindrome " + originaln);
				}
		 
	}

}
