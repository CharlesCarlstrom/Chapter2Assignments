/**
 * 
 */
package gameZone;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @author CC113884
 *
 */
public class RandomGuess2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
			Random r = new Random();
			final int low = 0;
			final int high = 9;
			String msg;
			int result1 = r.nextInt(10) + low;
			int result2 = r.nextInt(10) + low;
			int result3 = r.nextInt(10) + low;
			int userGuess1;
			int userGuess2;
			int userGuess3;
			userGuess1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a number between " + low + " and " + high ));
			userGuess2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a number between " + low + " and " + high ));
			userGuess3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a number between " + low + " and " + high ));
			
			if(userGuess1 == result1)
				msg = "\n Your Guess was Right!";
				else 
					if(userGuess1 < result1)
						msg = "\n Your Guess was to low";
					else 
						msg = "\n Your Guess was to high";
			JOptionPane.showMessageDialog(null, "the numbers is " + result1 + msg);
			
			if(userGuess2 == result2)
				msg = "\n Your Guess was Right!";
				else 
					if(userGuess2 < result2)
						msg = "\n Your Guess was to low";
					else 
						msg = "\n Your Guess was to high";
			JOptionPane.showMessageDialog(null, "the numbers is " + result2 + msg);
	
			if(userGuess3 == result3)
				msg = "\n Your Guess was Right!";
				else 
					if(userGuess3 < result3)
						msg = "\n Your Guess was to low";
					else 
						msg = "\n Your Guess was to high";
			JOptionPane.showMessageDialog(null, "the numbers is " + result3 + msg);		
		
			if(userGuess1 == result1 && userGuess2 == result2 && userGuess3 == result3);
				msg = "\n You won $1,000,000";

			
	}

}
