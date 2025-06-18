package Methods;

public class Palindrome_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "madam";
		String reverse = "";
		for(int i = original.length() - 1;i>=0;i --) {
			reverse = reverse + original.charAt(i);
		}
			if(original.equals(reverse)) {
				System.out.println("The String is Palindrome");}
				else {
					System.out.println("The String is not Palindrome");
				}
			}
		}
		


