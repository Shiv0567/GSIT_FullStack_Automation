package Methods;

public class Strings_Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String sentence = "Hello how are you doing today?"; 
		 sentence = sentence.toLowerCase();
		 int count = 0; //count the vowels
		 for(int i = 0; i< sentence.length(); i++) {
			 char vi =sentence.charAt(i);
		 if (vi=='a'|| vi=='e'|| vi=='i'|| vi=='o'|| vi=='u') {
			 count++;
		 }
}
		 System.out.println("The Count is "+ count);
	}
}
	
