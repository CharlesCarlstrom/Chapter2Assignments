/**
 * 
 */
package decisionMaking;
import java.util.Scanner;
/**
 * @author CC113884
 *
 */
public class DoorPrize {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int choice;
		Scanner input = new Scanner(System.in);
		System.out.println("choose ONE of three doors");
		choice = input.nextInt();
		
		if(choice == 1)
		{
			System.out.println("A brand newish Car!!! New to you anyways.");
			
		}
		if(choice == 2)
		{
			System.out.println("A blender");
			
		}
		if(choice == 3)
		{
			System.out.println("An old mint");
			
		}
		if(choice > 3)
		{
			System.out.println("you lose");
			
		}
	}

}
