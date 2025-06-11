package Conditional_Statements;

public class Count_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4567 ; 
		int count = 0 ;
		while(num != 0);{
			num = num/10 ;
			count++;
		}
        System.out.println("The Count is " + count);
	}

}
