// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
        double interest = Double.parseDouble(args[1]);
        int years = Integer.parseInt(args[2]);
        double futVal = currentValue * (Math.pow((1+interest/100), years));
        // I initialize a variable for each Input, then make futVal the outcome of the interest formula
        System.out.println("After" + years + ", a $" + currentValue + " saved at " + interest + "% will yield $" + Math.round(futVal));
	}
}