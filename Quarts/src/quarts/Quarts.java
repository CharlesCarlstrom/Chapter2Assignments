/**
 * 
 */
package quarts;
import javax.swing.JOptionPane;
/**
 * @author CC113884
 *
 */
public class Quarts {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	//
	String Answers;
	
	int gallon;
	final int quartInAGallon = 4;
	int userInputQuarts;
	int gallonOutPut;
	int quartsRemaining;
	
	
	
	Answers = JOptionPane.showInputDialog(null, "how many Quarts would you like Sir or Madam?"," ", JOptionPane.QUESTION_MESSAGE);
	userInputQuarts = Integer.parseInt(Answers);
	
	gallonOutPut = userInputQuarts / quartInAGallon;
	quartsRemaining = userInputQuarts % (gallonOutPut * quartInAGallon);
	
	JOptionPane.showMessageDialog(null, "You ordered " + userInputQuarts + " Quarts, that is " + gallonOutPut + " Gallons and " + quartsRemaining + " Quarts remaining.");
	
	}

}
