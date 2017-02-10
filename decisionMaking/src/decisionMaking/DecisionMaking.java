/**
 * 
 */
package decisionMaking;

import java.util.Scanner;

/**
 * @author CC113884
 *
 */
public class DecisionMaking {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int age;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age. >>>>> ");
		age = input.nextInt();
		if(age <= 18)
		{
			System.out.println("User is less than 18 yrs old.");
		}
		if(age > 18 && age > 30)
		{
			System.out.println("User is older than 18");
		}	
	    if(age > 31 && age < 50)
	    {
	    	System.out.println("sucks to suck.");
	    }
	    
	
	}

}
