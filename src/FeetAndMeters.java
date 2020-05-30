/**
 * Homework4 - 6.9: Displays a table converting feet to meters and meters to feet
 * 
 * CIS2571-001
 * @author Darryl Karney
 * @version 21Jun2018
 */

public class FeetAndMeters {

	public static void main(String[] args) {
		//Declare variables
		double feet = 1, meters = 20;
		
		//Display headers
		System.out.println("Feet    Meters    |    Meters    Feet\n-------------------------------------");
		
		//Display table
		for(int i = 1; i <= 10; i++) {
			String firstSpacing = "    ";
			
			if (i == 10) {
				firstSpacing = "   ";
			}
			
			String spacing = "";
			
			switch(i) {
			case 1:
				spacing = "      |    ";
				break;
			case 2:
				spacing = "       |    ";
				break;
			case 3:
				spacing = "      |    ";
				break;
			case 4:
				spacing = "       |    ";
				break;
			case 5:
				spacing = "      |    ";
				break;
			case 6:
				spacing = "       |    ";
				break;
			case 7:
				spacing = "      |    ";
				break;
			case 8:
				spacing = "       |    ";
				break;
			case 9:
				spacing = "      |    ";
				break;
			case 10:
				spacing = "       |    ";
				break;
			}
			
			System.out.println((feet * i) + firstSpacing + footToMeter(feet * i) + spacing + (meters + ((i - 1) * 5)) + "    " + meterToFoot(meters + ((i - 1) * 5)));
		}
	}
	
	public static double footToMeter(double foot) {
		//Convert feet to meters
		return foot * 0.305;
	}
	
	public static double meterToFoot(double meter) {
		//Convert meters to feet
		return meter * 3.279;
	}

}
