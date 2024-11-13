// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		String personone = args[0];
        String persontwo = args[1];
        String personthree = args[2];
        // In hindsight I didnt need to declare the 3 different people cause Im not using the String and this whole thing could've been one line of code. Oops.
        double bill = Double.parseDouble(args[3]); // Likewise here but this still at least makes the code look nicer.
        System.out.println("Dear " + personthree + ", " + persontwo + ", and " + personone + ": pay " + Math.ceil(bill/3) + " Shekels" );
        short shirt = 3;
	}
}
