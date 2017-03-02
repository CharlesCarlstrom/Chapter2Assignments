/**
 * 
 */
package review;

import java.util.Scanner;

/**
 * @author cc113884
 *
 */
public class EnterSmallValue 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int userEntry;
		final int LIMIT = 3;
		Scanner input = new Scanner(System.in);
		System.out.print("please enter an integer no higher thn " + LIMIT + " > ");
		userEntry = input.nextInt();
		while(userEntry > LIMIT)
		{
			System.out.println("The number you entered was too high ");
			System.out.print("Please enter an integer no higher than " + LIMIT + " > ");
			userEntry = input.nextInt();
		}
		System.out.println("you correctly entered " + userEntry);
	}

}
