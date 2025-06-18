package Methods;

public class Lower_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String w1 = "Java";
		String w2 = "Is";
		String w3 = "Fun";
		
		w1 = w1.toLowerCase().charAt(0)+w1.substring(1);
		w2 = w2.toLowerCase().charAt(0)+w2.substring(1);
		w3 = w3.toLowerCase().charAt(0)+w3.substring(1);
		System.out.println(w1+" "+w2+" "+w3+" ");
	}

}
