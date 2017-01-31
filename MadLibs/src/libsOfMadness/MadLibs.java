/**
 * 
 */
package libsOfMadness;
import javax.swing.JOptionPane;
/**
 * @author CC113884
 *
 */
public class MadLibs {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//MadLibs
		String color, wordEst, bodyPartPlural, animal, noun, pluralNoun, wholeNumber;
		int a = 5; 
		int b; 
		int c;
		
		color = JOptionPane.showInputDialog(null, "What is your favorite color.");
		
		wordEst = JOptionPane.showInputDialog(null, "Pick a word that ends in est.");
		
		bodyPartPlural = JOptionPane.showInputDialog(null, "Name a plural body part.");
		
		wholeNumber = JOptionPane.showInputDialog(null, "Name a whole number.");
		b = Integer.parseInt(wholeNumber);
		
		animal = JOptionPane.showInputDialog(null, "Name an animal.");
		
		noun = JOptionPane.showInputDialog(null, "Give a noun.");
		
		pluralNoun = JOptionPane.showInputDialog(null, "Give a plural noun.");
		
		c = a - b;
		
		JOptionPane.showMessageDialog(null, "The " + color + " Dragon is the " + wordEst + " Dragon of all. It has " + wholeNumber + bodyPartPlural + ", and a " + animal + " shaped like a " + noun + ". It loves to eat " + pluralNoun + ", although it will feast on nearly anything." );
		
		

	}

}
