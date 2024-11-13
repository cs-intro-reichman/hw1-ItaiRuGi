// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		boolean minSin;
		if(minutes < 10){
			minSin = true;
		} else{
			minSin = false;
		} // I want to know if there are single digits in the minutes so that I can Add a zero before it 

		if(hours >= 24 || minutes > 59 || hours < 0 || minutes < 0 ){
			System.out.println("Your input is incorrect, please input a proper time format.");
		
		
		}else if(hours > 12 && minSin && hours < 24){
			System.out.println(hours-12 + ":0" + minutes + " PM");
		}	
		
		else if(hours > 12 && hours < 24){
			System.out.println(hours-12 + ":" + minutes + " PM");
		}

		else if(hours == 12 && minSin){
			System.out.println(hours + ":0" + minutes + " PM");
		}else if(hours == 12 && !minSin){
			System.out.println(hours + ":" + minutes + " PM");
		}

		else if(minSin && hours < 12 && hours >= 0){
				System.out.println(hours + ":0" + minutes + " AM");
			}else if(hours < 12 ){
				System.out.println(hours + ":" + minutes + " AM" );
			}
		// This whole mess is just a bunch of if else statements for every possibility of input that is valid.
		int x = 0;
	}
}