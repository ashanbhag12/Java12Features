package akshay;


public class SwitchExpressionsDemo {
	
	public static void main(String[] args) {
		
		String season = getSeason("January");
		System.out.println(season);
		
	}
	
	@SuppressWarnings("preview")
	private static String getSeason(String month) {
		
		
		/*
		 * No fall through. By default it will break after each case.
		 * Multiple cases can be separated by comma.
		 * The value returned will be assigned to a variable.
		 */
		String season = switch(month) {
			
			case "November", "December", "January", "February" -> "Winter";
			case "March", "April", "May" -> "Summer";
			case "June", "July", "August", "September" -> "Monsoon";
			case "October" -> "Retreating Monsoon";
			default -> "Illegal Month";
			
		};
		
		return season;
	}
}
