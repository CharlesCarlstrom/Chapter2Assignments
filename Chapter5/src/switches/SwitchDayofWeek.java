/**
 * 
 */
package switches;

import java.util.Scanner;

/**
 * @author CC113884
 *
 */
public class SwitchDayofWeek {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String day;
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter a day during the week for your schedule? >>>>");
		day = input.nextLine();
		switch(day)
		{
		case "monday":
		case "Monday":
			System.out.print("Reserve room for friday meeting");
			break;
		
		case "Tuesday":
		case "tuesday":
			System.out.print("Meeting with Principal");
			break;
		
		case "wednsday":
		case "Wednsday":
			System.out.print("That thing is due");
			break;
		
		case "Thursday":
		case "thursday":
			System.out.print("Get a job");
			break;
		
		}

	}

}
