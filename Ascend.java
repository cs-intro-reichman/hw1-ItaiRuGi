// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int a = ((int)((Math.random() * Integer.parseInt(args[0])) + 1));
		int b = ((int)((Math.random() * Integer.parseInt(args[0])) + 1));
		int c = ((int)((Math.random() * Integer.parseInt(args[0])) + 1));
		// I get three random integers within the range of zero and the limit that is was input
		int trumin = Math.min((Math.min(a, b)),(Math.min(b, c)));
		// I get the minimum value by get the min value between all 3 variables
		int trumax = Math.max((Math.max(a, b)), (Math.max(b, c)));
		// I get the maximum value in the same way but opposite
		int mid = Math.max((Math.min(a,b)), (Math.min(b, c)));
		// The middle integer would be the output of the maximum function of the (Minimmum of a and b) and (Minimum of b and c)
		System.out.println(trumin + " " + mid + " " + trumax);
		int x = 0;
	}
}
