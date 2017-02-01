/**
 * 
 */
package nauticalMiles;
import javax.swing.JOptionPane;
/**
 * @author CC113884
 *
 */
public class NauticalMiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	String answer;
	
	double userInputMiles;
	double kilo = 1.85;
	double nautical = 1.15;
	double kiloToMilesConvert;
	double nauticalMileConvertToMile;
	
	answer = JOptionPane.showInputDialog(null, "How many Miles would you like calculate in to Nautical and Kilometers?"," ", JOptionPane.QUESTION_MESSAGE);
	userInputMiles = Integer.parseInt(answer);
	
	kiloToMilesConvert = kilo * userInputMiles;
	nauticalMileConvertToMile = nautical * userInputMiles;
	
	JOptionPane.showMessageDialog(null, "(" + userInputMiles + " Miles) " + kiloToMilesConvert + " Kilometers and " + nauticalMileConvertToMile + " Nautical miles.");
	}

}
