/**
 * 
 */
package gamezone;

import javax.swing.JOptionPane;

/**
 * @author CC113884
 *
 */
public class RandomGuessMatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Creating random thing
		String guessString;
		int random;
		int guess;
		final int min = 1;
		final int max = 100;
		boolean isMatch;
		
		random = min + (int)(Math.random()* max);
		guessString = JOptionPane.showInputDialog(null, "guess my number between " + min + " and " + max + " random guess", "", JOptionPane.INFORMATION_MESSAGE);
		
		guess = Integer.parseInt(guessString);
		
		isMatch = guess == random;
		
		JOptionPane.showMessageDialog(null, "Your guess was " + (random - guess) + " numbers away from the random number.");
		
		JOptionPane.showMessageDialog(null, "The number was " + random + ". The result is " + isMatch + ".");
		
	}

}
