package Methods;

public class Banana_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = "banana";
		int count = 0;
		for(int i =0 ; i < S1.length(); i++) {
			if(S1.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("The Count is "+ count);
	}

}
