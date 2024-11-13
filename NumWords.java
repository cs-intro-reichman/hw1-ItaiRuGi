// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int number = Integer.parseInt(args[0]);
        int savenum = number;
        System.out.print((savenum / 100) + " hundreds, ");
        savenum = number;
        int x = 0;
        System.out.print(( savenum / 10 ) % 10 + " tens, and ");
        savenum = number;
        System.out.print( savenum % 10 + " ones.");
       // Not uploading for some reasong
        //This may have been a roundabout way of doing this, but I save a seperate integer to always return the value to it's original and perform operations to get the 
        // amount for each unit
	}
}
