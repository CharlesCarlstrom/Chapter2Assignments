/**
 * 
 */
package delgadosChoice;

import java.util.Scanner;

/**
 * @author CC113884
 *
 */
public class Delgados2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double burritoPrice = 3.00;
		double tacoPrice = 1.50;
		double sodaPrice = 0.99;
		double chimichangaPrice = 5.00;
		double churroPrice = 1.50;
		double potatoOlePrice = 1.50; 
		double tacoSaladPrice = 3.00;
		double fajitasPrice = 2.50;
		double enchiladaPrice = 4.00;
		double chimichangasOrdered = 0;
		double churrosOrdered = 0;
		double potatoOlesOrdered = 0;
		double enchiladasOrdered = 0;
		double tacoSaladsOrdered = 0;
		double fajitasOrdered = 0;
		double tacosOrdered = 0;
		double burritosOrdered = 0;
		double sodasOrdered = 0;
		double totalPrice;
		double totalPriceWithTax;
		int orderNumber;
	
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("hello welcome to Delgados Tacos");
		System.out.println("From the menu above what would you like >>>>>");
		System.out.println("Please select a menu number?");
		orderNumber = inputDevice.nextInt();
		inputDevice.nextLine();
		
		if(orderNumber == 1)
		{
		System.out.println("How many tacos do you want? >>>>> ");
		tacosOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		totalPrice = (tacosOrdered * tacoPrice);
		System.out.println("You ordered " + tacosOrdered + " Tacos, ");
		}
		
		if(orderNumber == 2)
		{
		System.out.println("How many Burritos do you want? >>>>> ");
		burritosOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		totalPrice = (burritosOrdered * burritoPrice); 
		System.out.println("You ordered " + burritosOrdered + " burritos");
		}
		
		if(orderNumber == 3)
		{
		System.out.println("How many fajitas do you want? >>>>>");
		fajitasOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		totalPrice = (fajitasOrdered * fajitasPrice);
		System.out.println("You ordered " + fajitasOrdered + " fajitas"); 
		}
		
		if(orderNumber == 4)
		{
		System.out.println("How many Chimichangas do you want? >>>>>");
		chimichangasOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		totalPrice = (chimichangasOrdered * chimichangaPrice);
		System.out.println("You ordered " + chimichangasOrdered + " chimichangas");
		}
		
		if(orderNumber == 5)
		{
		System.out.println("How many Churros do you want? >>>>>");
		churrosOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		totalPrice = (churrosOrdered * churroPrice);
		System.out.println("You ordered " + churrosOrdered + " churros");
		}
		
		if(orderNumber == 6)
		{
		System.out.println("How many potatoOles do you want? >>>>>");
		potatoOlesOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		totalPrice = (potatoOlesOrdered * potatoOlePrice);
		System.out.println("You ordered " + potatoOlesOrdered + " potatoOles");
		}
		
		if(orderNumber == 7)
		{
		System.out.println("How many Enchiladas do you want? >>>>>");
		enchiladasOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		totalPrice = (enchiladasOrdered * enchiladaPrice);
		System.out.println("You ordered " + enchiladasOrdered + " enchiladas");
		}
		
		if(orderNumber == 8)
		{ 
		System.out.println("How many Taco salads do you want? >>>>>");
		tacoSaladsOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		totalPrice = (tacoSaladsOrdered * tacoSaladPrice);
		System.out.println("You ordered " + tacoSaladsOrdered + " taco salads");
		}
		
		if(orderNumber == 9)
		{
		System.out.println("How many cans of soda do you want? >>>>>");
		sodasOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		totalPrice = (sodasOrdered * sodaPrice);
		System.out.println("You ordered " + sodasOrdered + " sodas");
		}
		
		
		 totalPrice = (burritosOrdered * burritoPrice) + (tacosOrdered * tacoPrice) + (fajitasOrdered * fajitasPrice) 
			    + (chimichangasOrdered * chimichangaPrice) + (churrosOrdered * churroPrice) + (tacoSaladsOrdered * tacoSaladPrice) 
				+ (potatoOlesOrdered * potatoOlePrice) + (enchiladasOrdered * enchiladaPrice) + (sodasOrdered * sodaPrice); 		
		
		
		
		
		totalPriceWithTax = totalPrice * 1.075;
		System.out.println("Your Grand total (with tax) is $" + totalPriceWithTax);

		
		
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
		@SuppressWarnings("unused")
		double salesTax = .75;
	}


	}


