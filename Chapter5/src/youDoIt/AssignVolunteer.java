/**
 * 
 */
package youDoIt;

import java.util.Scanner;

/**
 * @author cc113884
 *
 */
public class AssignVolunteer {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int donationType;
		String volunteer;
		final int CLOTHING_CODE = 1;
		final int OTHER_CODE = 2;
		final String CLOTHING_PRICER = "Regina";
		final String OTHER_PRICER = "Marco";
		
		Scanner input = new Scanner(System.in);
		System.out.println("what type of donation is this? ");
		System.out.println("Enter " + CLOTHING_CODE + "for clothing," + OTHER_CODE + " for anything else... ");
		donationType = input.nextInt();
		
		if(donationType == CLOTHING_CODE)
		{
			volunteer = CLOTHING_PRICER;
		}
		else
			volunteer = OTHER_PRICER;
		
		System.out.println("you entered " + donationType);
		System.out.println("The volunteer who will price this item is " + volunteer);
	}

}
