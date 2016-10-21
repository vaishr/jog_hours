/**
 *   File Name: HoursJogged.java<br>
 *
 *   Reddy, Vaishnavi<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 20, 2016
 *   
 */

package com.sqa.vr;

import java.util.*;

import com.sqa.vr.helpers.*;

/**
 * HoursJogged //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Reddy, Vaishnavi
 * @version     1.0.0
 * @since       1.0
 *
 */
public class HoursJogged {

	/**
	 * @param args
	 */
	private static int totalJoggedHours = 0;
	private static final int daysInWeek = 7;
	private static double avgJoggedHours;
	private static int input;
	private static String joggerType;
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to the jogging App!");
		for (int i = 0; i < daysInWeek; i++) {
			try {
				System.out.println("Enter hours jogged on Day " + (i+1));
				input = Integer.parseInt(scanner.nextLine().trim());
				totalJoggedHours = totalJoggedHours + input;
				continue;
			}
			catch (NumberFormatException e) {
				// Output to the user that the number is not valid
				System.out.println("You have not entered a valid number.");
				// Continue the infinite loop to get a valid number conversion
				i--;
				continue;
			}
		}
		avgJoggedHours = ((double) totalJoggedHours)/7;
		
		System.out.println("This week you jogged " + totalJoggedHours + " TOTAL hours, for an AVERAGE of " + String.format("%.2f", avgJoggedHours) + " /day");
		if (totalJoggedHours >= 40) {
			joggerType = "PREMIUM";
		}
		else if (totalJoggedHours >= 20 && totalJoggedHours < 40) {
			joggerType = "ADVANCED";
		}
		else if (totalJoggedHours >= 10 && totalJoggedHours < 20) {
			joggerType = "DEDICATED";
		}
		else {
			joggerType = "AMATEUR";
		}
		System.out.println("You are a " + joggerType + " jogger!");
	}
	
	
}


