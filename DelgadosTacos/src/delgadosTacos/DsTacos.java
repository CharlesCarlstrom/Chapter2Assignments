/**
 * 
 */
package delgadosTacos;
import java.util.Scanner;
/**
 * @author CC113884
 *
 */
public class DsTacos {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		String burrito, taco, chimichango, churro, potatoOle, enchiladas, tacoSalad, fajita;
		double burritoPrice = 3.00;
		double tacoPrice = 1.50;
		double popPrice = 0.99;
		double chimichangaPrice = 5.00;
		double churroPrice = 1.50;
		double potatoOlePrice = 1.50; 
		double tacoSaladPrice = 3.00;
		double fajitasPrice = 2.50;
		double enchiladaPrice = 4.00;
		double chimichangasOrdered;
		double churrosOrdered;
		double potatoOlesOrdered;
		double enchiladasOrdered;
		double tacoSaladsOrdered;
		double fajitasOrdered;
		double tacosOrdered;
		double burritosOrdered;
		double totalPrice;
		double totalPriceWTax;
		
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("How many tacos do you want? >>>>>");
		tacosOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Burritos do you want? >>>>>");
		burritosOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many fajitas do you want? >>>>>");
		fajitasOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Chimichangas do you want? >>>>>");
		chimichangasOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Churros do you want? >>>>>");
		churrosOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many potatoOles do you want? >>>>>");
		potatoOlesOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Enchiladas do you want? >>>>>");
		enchiladasOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Taco salads do you want? >>>>>");
		tacoSaladsOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		totalPrice = (burritosOrdered * burritoPrice) + (tacosOrdered * tacoPrice) + (fajitasOrdered * fajitasPrice) 
				+ (chimichangasOrdered * chimichangaPrice) + (churrosOrdered * churroPrice) + (tacoSaladsOrdered * tacoSaladPrice) 
				+ (potatoOlesOrdered * potatoOlePrice) + (enchiladasOrdered * enchiladaPrice); 
		
		System.out.println("How you ordered " + tacosOrdered + " Tacos," + burritosOrdered + "a total price of " + totalPrice);
		

		
		
	}
	public static void menu()
	{
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println("***********************************");
	System.out.println("* * * * * * * * * * * * * * * * * *");
	System.out.println("*******  Taco Prices $1.50 ********");
	System.out.println("****** Burrito Prices $3.00 *******");
	System.out.println("*****  Fajitas Prices $2.50  ******");
	System.out.println("****  Enchilada Prices  $4.00  ****");
	System.out.println("***  Chimichanga Prices  $5.00  ***");
	System.out.println("**** Potato Ole  Prices $1.50  ****");
	System.out.println("***** Taco Salad Prices $3.00 *****");
	System.out.println("******  Churro Prices $1.50  ******");	
	System.out.println("*******  Soda Prices $0.99  *******");
	System.out.println("* * * * * * * * * * * * * * * * * *");
	System.out.println("***********************************");
	System.out.println();
	System.out.println();
	System.out.println();
	}
	
	public static void salesTax ()
	{
		double salesTax = .75;
	}
}
