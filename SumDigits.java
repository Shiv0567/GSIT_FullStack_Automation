package Conditional_Statements;

public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2345;
		int sum = 0;
		while(num !=0) {
			int num1 = num%10;
			sum+=num1;
			num = num/10;
		}
		System.out.println("The sum is " + sum);

	}

}
