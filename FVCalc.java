// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
        double interest = Double.parseDouble(args[1]);
        int years = Integer.parseInt(args[2]);
        double futVal = currentValue * (Math.pow((1+interest/100), years));
        // I initialize a variable for each Input, then make futVal the outcome of the interest formula
        int x = 0;
        System.out.println("After a starting investment of: " + currentValue + " shekels, at an interest rate of: " + interest + "% over " + years + "years, you will have: " + futVal + " Shekels" );
	}
}