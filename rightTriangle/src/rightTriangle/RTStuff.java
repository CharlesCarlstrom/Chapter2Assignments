/**
 * 
 */
package rightTriangle;
import java.util.Scanner;
/**
 * @author CC113884
 *
 */
public class RTStuff {

	/**
	 * @param args
	 */
	private static Scanner input;
	public static void main(String[] args) 
	{
		String whichSide;
		
		
	int response = 0;
	do{
		input = new Scanner(System.in);
		System.out.print("please select a side you'd like to be answered A, B, Or C >>>>");
		whichSide = input.nextLine();
		
		if("A".equals(whichSide))
		{
			displayAside();
		}
		if("B".equals(whichSide))
		{
			displayBside();
		}
		if("C".equals(whichSide))
		{
			displayCside();
		}
		System.out.print("\nWould you like to solve for another triangle?");
		System.out.print("\nEnter 1 for yes, or any other number for no >>>>");
		response = input.nextInt();
	}while(response  == 1);
	System.out.print("Have fantabulous Day");
	}
	
	
	
	public static void displayAside()
	{
	double userEntryC, userEntryB, answerA;
	System.out.print("enter you number for side C");
	userEntryC = input.nextInt();	
	System.out.print("enter your number for side B");
	userEntryB = input.nextInt();
	answerA = Math.sqrt(userEntryC * userEntryC - userEntryB * userEntryB);
	System.out.print("The answer for side A is" + answerA);
	}
	public static void displayBside()
	{
	double userEntryC, userEntryA, answerB;
	System.out.print("enter you number for side C");
	userEntryC = input.nextInt();
	System.out.print("enter your number for side A");
	userEntryA = input.nextInt();
	answerB = Math.sqrt(userEntryC * userEntryC - userEntryA * userEntryA);
	System.out.print("The answer for side B is" + answerB);
	}
	public static void displayCside()
	{
	double userEntryA, userEntryB, answerC;
	System.out.print("enter you number for side A");
	userEntryA = input.nextInt();
	System.out.print("enter your number for side B");
	userEntryB = input.nextInt();
	answerC = Math.sqrt(userEntryA * userEntryA - userEntryB * userEntryB);
	System.out.print("The answer for side C is" + answerC);
	}

}
