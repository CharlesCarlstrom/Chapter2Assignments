/**
 * 
 */
package pizza;
import java.util.Scanner;
/**
 * @author cc113884
 *
 */
public class PizzaChoice {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String choiceYes;
		String pizzaKind = null;
		//String choiceNo = null;
		String size;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Would you like a pizza? Yes or No >>>>>>>");
		choiceYes = input.nextLine();
		if("yes".equals(choiceYes) || "yes".equals(choiceYes) || "Y".equals(choiceYes))
		{
			System.out.print("You said " + choiceYes + " to have a pizza.");
			System.out.print("please choose a size, Small, Medium, or Large >>>>>>");
			size = input.nextLine();
			if("Small".equals(size) || "Medium".equals(size) || "large".equals(size))
			{
				System.out.print("You said " + size + " pizza size.");
				System.out.print("What kind of Pizza do you want? Pepperoni, Sausage, and or Cheese?>>>>");
				if("Pepperoni".equals(pizzaKind) || "Sausage".equals(pizzaKind) || "Cheese".equals(pizzaKind))
				{
					System.out.print("You said " + pizzaKind + " that sounds delicious");
					System.out.print("Your oeder consists of " + size + " Pizza, with the toppings of " + pizzaKind);
				}
			}
		}
		else if("No".equals(choiceYes) || "no".equals(choiceYes) || "N".equals(choiceYes) || "n".equals(choiceYes))
		{
			System.out.print("You said " + choiceYes + "to have a Pizza. \n");
			System.out.print("Please leave... there is a line building up behind you, don't turn around though cause they are definitly there.");
			choiceYes = input.nextLine();
		}
	}

}
