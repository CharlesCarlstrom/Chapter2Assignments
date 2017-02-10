/**
 * 
 */
package exercisesPage175;
import javax.swing.JOptionPane;
/**
 * @author CC113884
 *Feb 6th 2017
 */
public class FiveB 
{
	
	
	public static void main(String[] args) 
	{
	String userInputString;
	double secondDoubleEntry;
	double firstDoubleEntry;
	double answer;
	
	userInputString = JOptionPane.showInputDialog(null, "Please enter a value,  for example 2.0");
	firstDoubleEntry = Double.parseDouble(userInputString);
	
	userInputString = JOptionPane.showInputDialog(null, "enter a value, for example 2.0");
	secondDoubleEntry = Double.parseDouble(userInputString);
			
	answer = firstDoubleEntry / secondDoubleEntry;
	
	JOptionPane.showMessageDialog(null, " " + firstDoubleEntry + " is " + answer + " precent of " + secondDoubleEntry + " = " + answer);


	}

}
